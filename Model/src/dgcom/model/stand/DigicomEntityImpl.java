package dgcom.model.stand;

import oracle.jbo.AttributeList;
import oracle.jbo.NoDefException;
import oracle.jbo.domain.Date;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.SequenceImpl;
import oracle.jbo.server.TransactionEvent;

public class DigicomEntityImpl extends EntityImpl {
    public DigicomEntityImpl() {
        super();
    }
    String ModifiedBy;
    String Modifiedby;
    String CreatedBy;
    Date   ModificationDate;
    Date   CreatedDate;
    Date   ModifiedDate;
    String Createdby;
    Date   Createddate;
    String Posted;
    String IsMigrated;
    String SrvSequenceName="ADF_TEMP_PK_SEQ";

    public void setIsMigrated(String IsMigrated) {
        this.IsMigrated = IsMigrated;
    }

    public String getIsMigrated() {
        return IsMigrated;
    }

    public void setPosted(String Posted) {
        this.Posted = Posted;
    }

    public String getPosted() {
        return Posted;
    }

    public void setPostedby(String Postedby) {
        this.Postedby = Postedby;
    }

    public String getPostedby() {
        return Postedby;
    }
    String Postedby;
 
    public void setModifiedby(String Modifiedby) {
        this.Modifiedby = Modifiedby;
    }

    public String getModifiedby() {
        return Modifiedby;
    }
    
    public void setModifiedBy(String ModifiedBy) {
        this.ModifiedBy = ModifiedBy;
    }

    public String getModifiedBy() {
        return ModifiedBy;
    }

    public void setCreatedBy(String CreatedBy) {
        this.CreatedBy = CreatedBy;
    }

    public String getCreatedBy() {
        return CreatedBy;
    }

    public void setModificationDate(Date ModificationDate) {
        this.ModificationDate = ModificationDate;
    }

    public Date getModificationDate() {
        return ModificationDate;
    }

    public void setCreatedDate(Date CreatedDate) {
        this.CreatedDate = CreatedDate;
    }

    public Date getCreatedDate() {
        return CreatedDate;
    }

    public void setModifiedDate(Date ModifiedDate) {
        this.ModifiedDate = ModifiedDate;
    }

    public Date getModifiedDate() {
        return ModifiedDate;
    }

    public void setCreatedby(String Createdby) {
        this.Createdby = Createdby;
    }

    public String getCreatedby() {
        return Createdby;
    }

    public void setCreateddate(Date Createddate) {
        this.Createddate = Createddate;
    }

    public Date getCreateddate() {
        return Createddate;
    }


    @Override
    protected void create(AttributeList attributeList) {
        // TODO Implement this method
        super.create(attributeList);
//        if (1==1) {
//            return;
//       }
        int noofpk=0;
        String pkName="";
        for (int ii = 0; ii < this.getEntityDef().getAttributeCount(); ii++) {
            if (this.getEntityDef().getAttributeDefs()[ii].isPrimaryKey()) {
                noofpk++;
                pkName=this.getEntityDef().getAttributeDefs()[ii].getColumnName().toString().toUpperCase();
            }
        }
        if (noofpk!=1 ||pkName.equals("ROWID")) {
            return;
       }
        
        for (int ii = 0; ii < this.getEntityDef().getAttributeCount(); ii++) {
            if (this.getEntityDef().getAttributeDefs()[ii].isPrimaryKey()) {
                if (this.getEntityDef().getAttributeDef(ii).getJavaType().getName().toUpperCase().contains("STRING")) {
                    setAttribute(this.getEntityDef().getAttributeDef(ii).getIndex(),
                                 tmpAdfPK(getSrvSequenceName()).toString());
                }
                else {
                    System.out.println("creating pk");
                    System.out.println(this.getEntityDef().getAttributeDef(ii).getName());
                    setAttribute(this.getEntityDef().getAttributeDef(ii).getIndex(),
                                 Math.abs(Integer.parseInt(tmpAdfPK(getSrvSequenceName()).toString())) ); 
                }


            }
        }
        for (int ii = 0; ii < this.getEntityDef().getAttributeCount(); ii++) {


            try {
                if (this.getEntityDef().findAttributeDef("Locationid").getColumnName().toString().equals("LOCATIONID")) {
                    setAttribute(this.getEntityDef().findAttributeDef("Locationid").getIndex(),
                                 DigicomClass.getUserLocation());
                    break;
                }
            } catch (NoDefException e) {
                // TODO: Add catch code
                e.getMessage();
            }

        }
    }
    
    protected oracle.jbo.domain.Number tmpAdfPK(String sequenceName) {
      SequenceImpl s = new SequenceImpl(sequenceName,getDBTransaction());
      return s.getSequenceNumber().multiply(-1);
    }

    @Override
    protected void doDML(int i, TransactionEvent transactionEvent) {
        
        if(i==DML_INSERT) {
            setCreatedby(DigicomClass.getConnectedUser());
            setCreatedBy(DigicomClass.getConnectedUser());
            setCreateddate(new oracle.jbo.domain.Date(new java.sql.Timestamp(System.currentTimeMillis())));
            setCreatedDate(new oracle.jbo.domain.Date(new java.sql.Timestamp(System.currentTimeMillis())));
            try {
                setIsMigrated("N");
           } catch (Exception e) {
                // TODO: Add catch code
                e.printStackTrace();
            }
            
        }
        else if(i==DML_UPDATE) {
             setModificationDate(new oracle.jbo.domain.Date(new java.sql.Timestamp(System.currentTimeMillis())));
             setModifiedDate(new oracle.jbo.domain.Date(new java.sql.Timestamp(System.currentTimeMillis())));
             setModifiedBy(DigicomClass.getConnectedUser());
             setModifiedby(DigicomClass.getConnectedUser());
             try {
                if (getPosted().equals("Y")) {
                    setPostedby(DigicomClass.getConnectedUser());
                }
            } catch (Exception e) {
                // TODO: Add catch code
                e.printStackTrace();
            }
                 }
    
        super.doDML(i, transactionEvent);
    } 
    
    public void doCheckDateRight(){
        System.out.println("PAKISTAN-doCheckDateRight");
    }

    public void setSrvSequenceName(String SrvSequenceName) {
        this.SrvSequenceName = SrvSequenceName;
    }

    public String getSrvSequenceName() {
        return SrvSequenceName;
    }
}
