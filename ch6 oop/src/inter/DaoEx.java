package inter;

// DataAccessObject 인터페이스, OracleDao 클래스, MySqlDao 클래스를 이용한 예제

interface DataAccessObject {
    void select();

    void insert();

    void update();

    void delete();

}

class OracleDao implements DataAccessObject {

    @Override
    public void select() {

    }

    @Override
    public void insert() {

    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {

    }

}

class MySqlDao implements DataAccessObject {

    @Override
    public void select() {

    }

    @Override
    public void insert() {

    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {

    }

}

public class DaoEx {
    public static void main(String[] args) {
        dbWork(new OracleDao());
        dbWork(new MySqlDao());

    }

    static void dbWork(DataAccessObject dao) {
        dao.select();
        dao.insert();
        dao.update();
        dao.delete();
        System.out.println();
    }
}
