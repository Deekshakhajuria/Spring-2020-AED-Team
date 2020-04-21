/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author niramaykelkar
 */
public class DonorWorkRequest extends WorkRequest{
    
    private String testResult;
    private String donorId;
    private static int count = 1;
    private String comments;
    
    public DonorWorkRequest()
    {
        StringBuffer sb = new StringBuffer();
        //sb.append("DONOR");
        //sb.append(count);
        //donorId = sb.toString();
        count++;
    }

    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }

    public String getDonorId() {
        return donorId;
    }

    public void setDonorId(String donorId) {
        this.donorId = donorId;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        DonorWorkRequest.count = count;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
    
    @Override
    public String toString() {
        return this.donorId;
    }
}
