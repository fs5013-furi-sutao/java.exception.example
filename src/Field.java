public class Field {
    Company vihecleCompany;

    void execFieldAction() throws AppException {
        for (int id = 1; id <= 10; id++) {
            vihecleCompany.add(new Employee(id));
        }

        vihecleCompany.allEmployeeIdsInOrder();
        vihecleCompany.allEmployeeHashCodesInOrder();
    }

    Field joinedCompany(String companyName) {
        this.vihecleCompany = new Company(companyName);
        return this;
    }
}
