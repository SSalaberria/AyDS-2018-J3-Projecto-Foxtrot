package ayds.dictionary.foxtrot.model.databases;public class TranslatorDatabasesModule {    private static TranslatorDatabasesModule instance;    private DataBase dataBase;    private TranslatorDatabasesModule() {        dataBase = new DataBaseSQL();    }    public static TranslatorDatabasesModule getInstance() {        if(instance == null)            instance = new TranslatorDatabasesModule();        return instance;    }    public DataBase getDataBase(){        return dataBase;    }}