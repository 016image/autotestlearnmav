package autotestlearn.lesson12.task2;

import lesson12.task2.Helper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class HelperXmlTest extends HelperTest {

    @Test
    @DisplayName("XML: Проверка листа users")
    void testXmlUserTable() throws IOException {
        String result = Helper.getXmlFromXls(PATH, "users");
        String xmlPart = "<item><action>api</action><created_on>2020-09-26 23:07:34</created_on><id>10</id><updated_on>2020-09-26 23:07:34</updated_on><user_id>6</user_id><value>6218bbecc4dec9fce01dd1b7f26cef55e9c4dfb4</value></item>" +
                "<item><action>feeds</action><created_on>2020-09-26 23:08:23</created_on><id>12</id><updated_on>2020-09-26 23:08:23</updated_on><user_id>6</user_id><value>b6cfe70e7a4ee8e8cef07c9df60b6228639bb553</value></item>" +
                "<item><action>session</action><created_on>2020-09-26 22:48:56</created_on><id>2</id><updated_on>2020-09-26 22:49:29</updated_on><user_id>1</user_id><value>751e032dcc4b5b219efb7f72b608b9063a595509</value></item>" +
                "<item><action>session</action><created_on>2020-09-26 22:50:30</created_on><id>4</id><updated_on>2020-09-26 22:50:30</updated_on><user_id>1</user_id><value>1a0e210e0a8e1f63a96ea2d4326a48346a6dff74</value></item>";
        Assertions.assertTrue(result.contains(xmlPart));
    }

    @Test
    @DisplayName("XML: Проверка листа projects")
    void testXmlProjectsTable() throws IOException {
        String result = Helper.getXmlFromXls(PATH, "projects");
        String xmlPart = "<item><description>дескрипшен</description><homepage>нет</homepage><id>1</id><is_public>true</is_public><name>Тестовый проект</name></item>" +
                "<item><description>дескрипшен 2</description><homepage>нет</homepage><id>2</id><is_public>false</is_public><name>Тестовый проект 2</name></item>" +
                "<item><description>public</description><homepage>нет</homepage><id>4</id><is_public>true</is_public><name>Тестовый проект public</name></item>" +
                "<item><description>private</description><homepage>нет</homepage><id>5</id><is_public>false</is_public><name>Тестовый проект private</name></item>";
        Assertions.assertTrue(result.contains(xmlPart));
    }

    @Test
    @DisplayName("XML: Проверка листа roles")
    void testXmlRolesTable() throws IOException {
        String result = Helper.getXmlFromXls(PATH, "roles");
        String xmlPart = "<item><builtin>1</builtin><id>1</id><is_assignable>true</is_assignable><name>Non member</name><position>0</position></item>" +
                "<item><builtin>2</builtin><id>2</id><is_assignable>true</is_assignable><name>Anonymous</name><position>0</position></item>" +
                "<item><builtin>0</builtin><id>3</id><is_assignable>true</is_assignable><name>new_role</name><position>1</position></item>";
        Assertions.assertTrue(result.contains(xmlPart));
    }
}
