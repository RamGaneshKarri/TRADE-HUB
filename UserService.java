class UserService {
    public User createUser(String userId, String name, String email, String phone) {
        return new User(userId, name, email, phone);
    }
}