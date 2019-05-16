package com.qhit.Utils.PathUtils;

public class PathCommon {

    //网站logo地址
    public static String uploadWeblogo(){
        return "static/upload/system/";
    }

    //收录站点ICO地址
    public static String uploadWebICO(){
        return "static/upload/webico/";
    }

    //返回值收录站点ICO地址
    public static String ReturnUploadWebICO(){
        return "/upload/webico/";
    }

    //系统ICO地址
    public static String uploadLMICO(){
        return "static/";
    }

    //图片地址
    public static String uploadWebImages(){
        return "static/upload/images/";
    }

    public static String ReturnImagesUrl() {
        return "/upload/images/";
    }
    //更新文件地址
    public static String upDateWen(){return "static/update/";};

    //下载系统安装包
    public static String donwNowing(){return "static/runtime/";};

    //htmlpc模板路径
    public static String PCTemplateUrl(String url){
        return "templates/"+url+"/html/";
    }
    //htmlM模板路径
    public static String MTemplateUrl(String url){
        return "templates/"+url+"/mobile/";
    }

    //熊掌推送
    public static String XiongZhangTuiSong(String appid,String token,String type){
        return "http://data.zz.baidu.com/urls?appid="+appid+"&token="+token+"&type="+type;
    }
    //百度推送
    public static String BaiDuTuiSong(String site,String token){
        return "http://data.zz.baidu.com/urls?site="+site+"&token="+token;
    }
    //大淘客优惠券选项
    public static String DaTaoKeYouHui(String api,String page){
        return "http://api.dataoke.com/index.php?r=Port/index&type=total&appkey="+api+"&v=2&page="+page;
    }

    //上传附件地址
    public static String upDateLink(){return "static/update/fulink";};
    //获取附件地址
    public static String GetupDateLink(){return "/update/fulink/";};

}
