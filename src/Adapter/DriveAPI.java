package Adapter;

public class DriveAPI {
    public static void main(String[] args) {
        RestfulAPI restfulAPI=new RestfulAPI();
        SOAPAPI soapapi=new SOAPAPI();

        apiAdapter apiAdapt=new apiAdapt(restfulAPI,soapapi);
        apiAdapt.convertRequests();
    }
}
