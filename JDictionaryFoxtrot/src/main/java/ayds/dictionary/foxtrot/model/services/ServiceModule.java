package ayds.dictionary.foxtrot.model.services;public class ServiceModule {    private static ServiceModule instance;    private Service service;    private ServiceModule() {        service = new ServiceYandex();    }    public static ServiceModule getInstance() {      if (instance == null) {        instance = new ServiceModule();        }        return instance;    }    public Service getRemoteSource() {      return service;    }}