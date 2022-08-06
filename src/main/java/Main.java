public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Иван";
        post.passport = "4748 № 485952";
        post.phone = "+7(919)955-46-48";
        post.patronymic = "Иванович";
        post.surname = "Иванов";
        post.subscription = true;

        post.birthday = new FormDate();
        post.birthday.day = 13;
        post.birthday.month = 1;
        post.birthday.year = 1993;

    }
}
