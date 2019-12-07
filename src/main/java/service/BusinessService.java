package service;

//@Service
public class BusinessService {

    //@Autowired
    private Service1 service1;
    //@Autowired
    private Service2 service2;

    public int complexBusiness(int a) {
        service1.business1(a);
        int x = service2.business2(a);
        x++;
        return x;
    }
}
