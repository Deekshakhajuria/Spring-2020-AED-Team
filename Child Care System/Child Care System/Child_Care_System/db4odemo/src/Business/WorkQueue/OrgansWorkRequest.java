/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author moury
 */
public class OrgansWorkRequest extends WorkRequest{
    
    private String organsRequestId;
    private static int count = 1;
    private String comments;
    private String requestResult;

    public OrgansWorkRequest()
    {
        StringBuffer sb = new StringBuffer();
        sb.append("ORGANS");
        sb.append(count);
        organsRequestId = sb.toString();
        count++;
    }
    
    public String getOrgansRequestId() {
        return organsRequestId;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getRequestResult() {
        return requestResult;
    }

    public void setRequestResult(String requestResult) {
        this.requestResult = requestResult;
    }
    
    @Override
    public String toString() {
        return this.organsRequestId;
    }
    
}
