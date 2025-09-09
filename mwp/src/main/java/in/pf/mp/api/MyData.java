package in.pf.mp.api;

class MyData {
    private String field1;
    private String field2;
    private String reqId;

	public MyData(String field1, String field2,  String reqId) {
        this.field1 = field1;
        this.field2 = field2;
        this.reqId = reqId;
    }

	public String getField1() {
        return field1;
    }

    public void setField1(String field1) {
        this.field1 = field1;
    }

    public String getField2() {
        return field2;
    }

    public void setField2(String field2) {
        this.field2 = field2;
    }
    
    public String getReqId() {
 		return reqId;
 	}

 	public void setReqId(String reqId) {
 		this.reqId = reqId;
 	}
}