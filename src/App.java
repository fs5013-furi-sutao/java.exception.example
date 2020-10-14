public class App {
    public static void main(String[] args) {

        Field field = new Field().joinedCompany("Toyoda");

        try {
            field.execFieldAction();

        } catch (AppRuntimeException | AppException e) {
            System.out.println("アプリでエラーが発生しました");
            e.printStackTrace();
        }
    }
}
