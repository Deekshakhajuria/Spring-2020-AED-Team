/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author hp
 */
public class DonorTestWorkRequest extends WorkRequest{
    
    private String testResult;
    private String donorId;
    private static int count = 1;
    private String comments;
    
    public DonorTestWorkRequest()
    {
        StringBuffer sb = new StringBuffer();
        //sb.append("DONOR");
        //sb.append(count);
        //donorId = sb.toString();
        count++;
    }
    
    public String getOrgansRequestId() {
        return donorId;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }
    
    @Override
    public String toString() {
        return this.donorId;
    }
    
}
