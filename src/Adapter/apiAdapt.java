package Adapter;

public class apiAdapt implements apiAdapter{
    private RestfulAPI restfulAPI;
    private SOAPAPI soapapi;

    public apiAdapt(RestfulAPI restfulAPI, SOAPAPI soapapi) {
        this.restfulAPI = restfulAPI;
        this.soapapi = soapapi;
    }

    @Override
    public void convertRequests(){
        soapapi.soapRequest();
    }
}
