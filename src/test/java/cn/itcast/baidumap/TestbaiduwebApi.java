package cn.itcast.baidumap;


import cn.hutool.core.util.StrUtil;
import cn.hutool.http.HttpRequest;
import org.junit.Test;

public class TestbaiduwebApi {
    private String ak = "0DeBHKo76vq8hNx29UtHNgXLCdPqGG3h";

    //坐标转换测试
    @Test
    public void testGeoconV(){
        String url = "https://api.map.baidu.com/geoconv/v1/?coords=114.21892734521,29.575429778924&from=1&to=5&ak={}";
        url = StrUtil.format(url,ak);
        //发起get请求
        String body = HttpRequest.get(url).execute().body();
        System.out.println(body);
    }

    /**
     * 测试IP定位服务
     */
    @Test
    public void testLocation(){
        String url = "https://api.map.baidu.com/location/ip?ak={}&ip=140.206.149.83&coor=bd09ll";
        url = StrUtil.format(url,ak);

        //发起get请求
        String body = HttpRequest.get(url).execute().body();
        System.out.println(body);
    }

    /**
     * 测试地点输入提示服务
     */
    @Test
    public void testSuggestion(){
        String url ="https://api.map.baidu.com/place/v2/suggestion?query=仲恺农业&region=广州&city_limit=true&output=json&ak={}";
        url=StrUtil.format(url,ak);
        //发起get请求
        String body = HttpRequest.get(url).execute().body();
        System.out.println(body);
    }

    /**
     * 路线规划
     */
    @Test
    public void testDriving(){
        String url ="https://api.map.baidu.com/directionlite/v1/driving?origin=40.01116,116.339303&destination=39.936404,116.452562&ak={}";
        url = StrUtil.format(url,ak);
     //发起get请求
        String body = HttpRequest.get(url).execute().body();
        System.out.println(body);
    }

}


