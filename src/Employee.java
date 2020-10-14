public class Employee {

    int id;
    String name;

    Employee(int id) {
        this.id = id;
    }

    void notifyId() throws AppException {
        System.out.printf("My id is %d.\n", this.id);

        if (this.id == 4) throw new AppException("従業員 ID が 4 なのは許容しない");
    }

    void notifyHashCode() {
        try {
            System.out.printf("My hash code is %s.\n", this.name.hashCode());

        } catch (Exception e) {
            throw new AppRuntimeException("Hash コード取得に問題あり");
        }
    }
}