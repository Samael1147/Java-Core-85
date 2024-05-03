public class DataType {
    public static void main(String[] args) {
        System.out.println("Hello Java");
        // Cú pháp khỏi tạo biến
        // [kieu_du_lieu] [ten_bien] = [gia_tri_khoi_tao];

        // kiểu số nguyên : byte (1), short (2), int (4), long (8)
        int age = 18;
        System.out.println("age = " + age);

        // Kiểu số thực: float (4), double (8)
        float pi = 3.141592653589793f;
        double PI = 3.141592653589793;
        System.out.println("pi = " + pi);
        System.out.println("PI = " + PI);

        // Kiểu logic: boolean
        boolean isLoading = true;
        System.out.println("isLoading = " + isLoading);

        // Kiểu kí tự : char (2)
        char c = 'a';
        System.out.println("c = " + c);

        // kiểu xâu kí tự: String
        String name = "Samael";
        System.out.println("name = " + name);

        // Kiểu enum
        Gender male = Gender.MALE;
        System.out.println("male = " + male);

        // Class & Object
        Dog dog1 = new Dog();
        dog1.name = "Shiba";
        dog1.age = 5;
        dog1.gender = Gender.MALE;
        dog1.bark();
        int sum = dog1.sum(1,10);
        System.out.println("sum = " + sum);

        Dog dog2 = new Dog();
        dog2.name = "Chiquoaquoa";
        dog2.age = 3;
        dog2.gender = Gender.FEMALE;


    }

}
