package com.qhit.Utils.QrCode;


import java.util.Arrays;

/**
 * Created by yy on 2019/5/8.
 */
public class QrCodeTest {

    public static void main(String[] args) throws Exception {
        // 存放在二维码中的内容
        int[] arr = new int[10];
        for (int i = 0; i <10 ; i++) {
            arr[i]=i;
        }
        String s = Arrays.toString(arr);
        //System.out.println(Arrays.toString(arr));
        // 嵌入二维码的图片路径
        String imgPath = "D:/二维码/dog.jpg";
        // 生成的二维码的路径及名称
        String destPath = "D:/二维码/qrcode/jam.jpg";
        //生成二维码
        QRCodeUtil.encode(s, imgPath, destPath, true);
        // 解析二维码
        String str = QRCodeUtil.decode(destPath);
        // 打印出解析出的内容
        System.out.println(str);

    }

}