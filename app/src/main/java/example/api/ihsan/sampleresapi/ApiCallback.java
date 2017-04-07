package example.api.ihsan.sampleresapi;


public interface ApiCallback<T extends BaseApiResponse>{


    public void onRequestComplete(T response);

    public void onError(int errorCode, String errorMessage);
}
