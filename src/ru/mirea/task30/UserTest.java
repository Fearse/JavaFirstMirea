package ru.mirea.task30;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class UserTest {
    private User user1;
    private User user2;
    private User user3;
    private User user4;
    private User user5;

    @Before
    public void setUp() {
        user1 = new User("Денис", "Маслов", 20,"Воркута");
        user2 = new User("Вадим", "Иванов", 10,"Москва");
        user3 = new User("Андрей", "Зубцов", 50,"Москва");
        user4 = new User("Иван", "Петров", 30,"Москва");
        user5 = new User("Илья", "Городсков", 40,"Саранск");
    }
    @Test
    public void getAllUsers() {
        List<User> expected = User.getAllUsers();
        List<User> actual = new ArrayList<>();
        actual.add(user1);
        actual.add(user2);
        actual.add(user3);
        actual.add(user4);
        actual.add(user5);
        Assert.assertEquals(expected, actual);
        try (FileWriter file = new FileWriter("C:\\Users\\krivo\\OneDrive\\Рабочий стол\\Java\\JavaFirstMirea\\src\\ru\\mirea\\task31\\Test.md", true))
        {
            file.write("Test 1 passed \n");
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void getAllUsers_NO_NULL() {
        List<User> expected = User.getAllUsers();
        Assert.assertNotNull(expected);
        try (FileWriter file = new FileWriter("C:\\Users\\krivo\\OneDrive\\Рабочий стол\\Java\\JavaFirstMirea\\src\\ru\\mirea\\task31\\Test.md", true))
        {
            file.write("Test 2 passed \n");
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
    @Test
    public void getHowManyUsers() {
        int expected = User.getHowManyUsers();

        int actual = 5;

        Assert.assertEquals(expected, actual);
        try (FileWriter file = new FileWriter("C:\\Users\\krivo\\OneDrive\\Рабочий стол\\Java\\JavaFirstMirea\\src\\ru\\mirea\\task31\\Test.md", true))
        {
            file.write("Test 3 passed \n");
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
    @Test
    public void GetAllAgeUsers() {
        int expected = User.getAllAgeUsers();

        int actual = 150;

        Assert.assertEquals(expected, actual);
        try (FileWriter file = new FileWriter("C:\\Users\\krivo\\OneDrive\\Рабочий стол\\Java\\JavaFirstMirea\\src\\ru\\mirea\\task31\\Test.md", true))
        {
            file.write("Test 4 passed \n");
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
    @Test
    public void getAverageAgeOfAllUsers() {
        int expected = User.getAverageAgeOfAllUsers();

        int actual = 30;

        Assert.assertEquals(expected, actual);
        try (FileWriter file = new FileWriter("C:\\Users\\krivo\\OneDrive\\Рабочий стол\\Java\\JavaFirstMirea\\src\\ru\\mirea\\task31\\Test.md", true))
        {
            file.write("Test 5 passed \n");
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
    @Test
    public void newUser_EMPTY_NAME() {
        for (User user : User.getAllUsers()){
            if (user.getName() != null && user.getName().isEmpty()) {
                Assert.fail("Попытка создания пользователя с пустым именем");
            }
        }
        try (FileWriter file = new FileWriter("C:\\Users\\krivo\\OneDrive\\Рабочий стол\\Java\\JavaFirstMirea\\src\\ru\\mirea\\task31\\Test.md", true))
        {
            file.write("Test 6 passed \n");
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void newUser_AGE_ZERO() {
        for (User user : User.getAllUsers()) {
            if (user.getAge() <= 0) {
                Assert.fail("Попытка создания пользователя c не допустимым возрастом");
            }
        }
        try (FileWriter file = new FileWriter("C:\\Users\\krivo\\OneDrive\\Рабочий стол\\Java\\JavaFirstMirea\\src\\ru\\mirea\\task31\\Test.md", true))
        {
            file.write("Test 7 passed \n");
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
    }

}
