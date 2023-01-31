
public class Main {
    public static void main(String[] args) {
        Author authorCaptainDaughter = new Author("Александр", "Пушкин");
        Author authorRadunitsa = new Author("Сергей", "Есенин");
        Book captainDaughter = new Book("Капитанская дочка", authorCaptainDaughter, 1836);
        Book radunitsa = new Book("Радуница", authorCaptainDaughter, 1836);

        Book captainDaughter1 = new Book("Капитанская дочка", authorCaptainDaughter, 1836);

        System.out.println("captainDaughter.getNameBook() = " + captainDaughter.getNameBook());
        System.out.println("authorCaptainDaughter.getFullName() = " + authorCaptainDaughter.getFullName());
        System.out.println("captainDaughter.getYearPublication() = " + captainDaughter.getYearPublication());
        System.out.println("captainDaughter.getYearPublication() = " + captainDaughter.getYearPublication());

        System.out.println();

        System.out.println("radunitsa.getNameBook() = " + radunitsa.getNameBook());
        System.out.println("authorRadunitsa.getFullName() = " + authorRadunitsa.getFullName());
        System.out.println("radunitsa.getYearPublication() = " + radunitsa.getYearPublication());

        System.out.println();

        System.out.println("captainDaughter.hashCode() = " + captainDaughter.hashCode());

        System.out.println("captainDaughter1.hashCode() = " + captainDaughter1.hashCode());

        System.out.println("captainDaughter.equals(radunitsa) = " + captainDaughter.equals(captainDaughter1));

        System.out.println("captainDaughter.toString() = " + captainDaughter.toString());
    }

}