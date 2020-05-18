package String;

/**
 * Created by edieye on 2020-05-17.
 */

/** 165. Compare Version Numbers **/
public class CompareVersion {
    public int compareVersion(String version1, String version2) {
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");
        int n = Math.max(v1.length,v2.length);
        for(int i=0; i<n; i++){
            int k = i<v1.length ? Integer.parseInt(v1[i]) : 0;
            int j = i<v2.length ? Integer.parseInt(v2[i]) : 0;
            if(k > j) return 1;
            if(k < j) return -1;
        }
        return 0;
    }
}
