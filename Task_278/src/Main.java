import java.io.*;

public class Main {
    public static void main(String[] args) {
        byte[] bIn = {1, 2, 3, 4, 5};
       byte[] bOut = new byte[5] ;
        try (ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bIn)) {
            for (int i  = 0; i < bIn.length; i++) {
                int a = byteArrayInputStream.read();
                System.out.println(a);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream()) {
            for (int i  = 0; i < bIn.length; i++) {
                byteArrayOutputStream.write(bIn);
                bOut = byteArrayOutputStream.toByteArray();
                System.out.println(bOut[i]);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
