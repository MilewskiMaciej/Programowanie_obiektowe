public interface Authentication {
    boolean login(String username, String password);
    void logout();
    boolean resetPassword(String username, String oldPassword, String newPassword);
}

class UserAuthentication implements Authentication{
    @Override
    public boolean login(String username, String password) {
        System.out.println("Logowanie użytkownika: " + username);
        return true;
    }

    @Override
    public void logout() {
        System.out.println("Wylogowałeś się.");
    }

    @Override
    public boolean resetPassword(String username, String oldPassword, String newPassword) {
        System.out.println("Pomyślnie zmieniono hasło.");
        return true;
    }
}

class AdminAuthentication implements Authentication {
    @Override
    public boolean login(String username, String password) {
        System.out.println("Admin " + username + " zalogował się pomyślnie.");
        return true;
    }

    @Override
    public void logout() {
        System.out.println("Wylogowałeś się.");
    }

    @Override
    public boolean resetPassword(String username, String oldPassword, String newPassword) {
        System.out.println("Pomyślnie zmieniono hasło admina.");
        return true;
    }
}
