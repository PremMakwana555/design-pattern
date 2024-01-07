package org.example.prototype;

public class IntelligentStudent extends Student{
    private int iq;

    public IntelligentStudent(){}

    public IntelligentStudent(IntelligentStudent st){
        super(st);
        this.iq = st.iq;
    }

    @Override
    public IntelligentStudent clone() {
//        super.clone();
        return new IntelligentStudent(this);
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }
}
