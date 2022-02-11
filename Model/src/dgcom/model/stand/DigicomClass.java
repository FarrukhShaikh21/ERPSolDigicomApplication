package dgcom.model.stand;

import java.sql.CallableStatement;
import java.sql.SQLException;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Calendar;

import oracle.adf.model.AttributeBinding;
import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCBindingContainer;
import oracle.adf.model.binding.DCDataControl;
import oracle.adf.model.binding.DCIteratorBinding;

import oracle.jbo.ApplicationModule;
import oracle.jbo.JboException;
import oracle.jbo.Key;
import oracle.jbo.Row;
import oracle.jbo.ViewObject;
import oracle.jbo.domain.Date;
import oracle.jbo.server.DBTransaction;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;

public class DigicomClass {
    public DigicomClass() {
        super();
    }
 String uname;
    public static String getUserLocation() {
             if (1==1) {
        return "KSD"    ;
       }   
        BindingContext      bc  =   BindingContext.getCurrent();
        DCBindingContainer dcb  =   bc.findBindingContainer("dgcom_view_LoginPageDef");
        DCDataControl       dc  =   dcb.findDataControl("modLoginDataControl");
        ApplicationModule   am  =   dc.getApplicationModule();
        ViewObject          vo  =   am.findViewObject("SysUsersVO1");
        vo.executeQuery();
            if (vo.getEstimatedRowCount()==1)
            {
                String userName=vo.first().getAttribute("Locationid").toString();
                return userName;
            }
            else{
                //vo.remove();
                throw new JboException("Error while creating record.");
            }
    }
  
    public static String getUserRegion() {
       if (1==1) {
        return "S"    ;
       }   
                BindingContext      bc  =   BindingContext.getCurrent();
                DCBindingContainer dcb  =   bc.findBindingContainer("dgcom_view_LoginPageDef");
                DCDataControl       dc  =   dcb.findDataControl("modLoginDataControl");
                ApplicationModule   am  =   dc.getApplicationModule();
                ViewObject          vo  =   am.findViewObject("SysUsersVO1");
                vo.executeQuery();
                    if (vo.getEstimatedRowCount()==1)
                    {
                        String userName=vo.first().getAttribute("Regionid").toString();
                        return userName;
                    }
                    else{
                        //vo.remove();
                        throw new JboException("Error while creating record.");
                    }
    }
  
    
     public static String getLocationName(String pLocId,String pValueType) {
         if (1==1) {
        return "LOCATION"    ;
       }    
         //pValueType=L=Location Description
         BindingContext      bc  =   BindingContext.getCurrent();
         DCBindingContainer dcb  =   bc.findBindingContainer("dgcom_view_LoginPageDef");
         DCDataControl       dc  =   dcb.findDataControl("modLoginDataControl");
         ApplicationModule   am  =   dc.getApplicationModule();
         ViewObject          vo  =   am.findViewObject("LocInfovo");
         if (vo!=null) {
             vo.remove();
        }
         vo  =   am.createViewObjectFromQueryStmt("LocInfovo", "SELECT S.LOCATION_DESCRIPTION,S.REGIONID FROM ALL_LOCATIONS S WHERE S.LOCATIONID='"+pLocId+"'");
         vo.executeQuery();
         
             if (vo.getEstimatedRowCount()==1)
             {
                  vo.first();
                 String locationId=vo.getCurrentRow().getAttribute(0).toString() ;
                 vo.remove();
                 return locationId;
             }
             else{
                 vo.remove();
                 //vo.remove();
                 throw new JboException("Error while creating record.");
             }
     }
     
    public static String getConnectedUser() {
          if (1==1) {
          return "ORACLE"  ;
       }    
        BindingContext      bc  =   BindingContext.getCurrent();
        DCBindingContainer dcb  =   bc.findBindingContainer("dgcom_view_LoginPageDef");
        DCDataControl       dc  =   dcb.findDataControl("modLoginDataControl");
        ApplicationModule   am  =   dc.getApplicationModule();
        ViewObject          vo  =   am.findViewObject("SysUsersVO1");
        vo.executeQuery();
            if (vo.getEstimatedRowCount()==1)
            {
                String userName=vo.first().getAttribute("Userid").toString();
                return userName;
            }
            else{
                //vo.remove();
                throw new JboException("Error while creating record.");
            }
    }
        public static String isOperationAllowed(String p_operation_type) {
            if (1==1) {
                return "U";
            }     

            BindingContext      bindingContext = BindingContext.getCurrent();
            DCBindingContainer  dcb            = bindingContext.findBindingContainer("dgcom_view_LoginPageDef");
            DCIteratorBinding   ib             = dcb.findIteratorBinding("SysUsersDetail1Iterator"); //can be used
            DCBindingContainer  dcbMod         = bindingContext.findBindingContainer("dgcom_view_tmpDigicomTemplatePageDef");
            AttributeBinding    moduleID       = (AttributeBinding) dcbMod.getControlBinding("Moduleid");
            ViewObject          vo             = ib.getViewObject();
            vo.reset();
            vo.setWhereClause("userid='"+getConnectedUser().toString()+"' and moduleid='"+moduleID.toString()+"'");
            vo.executeQuery();
            return vo.first().getAttribute(p_operation_type).toString();
            
        } 
        public static Date doConvertStringToJboDate(String pValue) {
        try {
            if (pValue.length()==0) {
                return null;
           }
            if (!pValue.contains(".")) {
                pValue=pValue.concat(" 00:00:00.000");
           }
            
                DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
                java.util.Date date = formatter.parse(pValue);
                java.sql.Date sqlDate = new java.sql.Date(date.getTime());
                Date jboDate = new oracle.jbo.domain.Date(sqlDate);
                return jboDate;
            }  
        catch (ParseException e) {
                throw new JboException("Unable To Convert String into date ("+pValue+")");
            }
        catch (NullPointerException e) {
                     return null;   
                    }
            
    }

    public static String doGetFormattedDate(String pValue,String pFormat) {
    try {
            System.out.println("I M DIGICOM CLASS and:"+ pValue);
            DateFormat formatter;
            formatter = new SimpleDateFormat("yyyy-MM-dd");
            java.util.Date date = formatter.parse(pValue);
            formatter =new SimpleDateFormat(pFormat);
            return formatter.format(date);
        }   catch (ParseException e) {
        System.out.println("I M DIGICOM CLASS");
            throw new JboException("Unable To Convert String into date ("+pValue+")");
        }
        
    }
    public static Integer doGetDateDifference(Date pValue1, Date pValue2) {

        try {
            return ((int) (pValue1.getValue().getTime() - pValue2.getValue().getTime()) / 1000 / 60 / 60 / 24) * -1;
        } catch (Exception e) {
            // TODO: Add catch code
            return 0;
        }
    }
    
    public static Date doGetAddedDate(Date pDate, int pValue) {
        String dt = pDate.toString();  // Start date
        Date d=doConvertStringToJboDate(dt);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar c = Calendar.getInstance();
         try {
             c.setTime(sdf.parse(dt));
         } catch (ParseException e) {
             return null;
         }
         c.add(Calendar.DATE,pValue);  // number of days to add
        dt = sdf.format(c.getTime());   
        /*   try {
            java.util.Date javadate = new java.util.Date(pDate.getValue().getTime() + (1000 * 60 * 60 * 24 * pValue));
            java.sql.Date sqldate = new java.sql.Date(javadate.getTime());
            oracle.jbo.domain.Date jboDate = new oracle.jbo.domain.Date(sqldate);
            return jboDate;
        } catch (Exception e) {
            // TODO: Add catch code
            return pDate;
        } */
        return doConvertStringToJboDate(dt); 
    }
    public static Date doGetStartEndDateOfDate(Date pDate,String pType) {
        java.util.Date javadate=null;
        Calendar calendar = Calendar.getInstance();
        DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
        try {
             javadate = df.parse(pDate.toString());
             calendar.setTime(javadate);
            int lastDate =(pType=="L"? calendar.getActualMaximum(Calendar.DATE):calendar.getActualMinimum(Calendar.DATE));
            calendar.set( Calendar.DATE, lastDate);
            javadate=calendar.getTime();
            java.sql.Date sqld=new java.sql.Date(javadate.getTime());
            
            return new Date(sqld);
        } catch (ParseException e) {
        }
        return null;
    }
    
    public static Date doGetAddeddMonths(Date pDate,Integer pValue) {
        String dt = pDate.toString();  // Start date
        Date d=doConvertStringToJboDate(dt);
       SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar c = Calendar.getInstance();
         try {
             c.setTime(sdf.parse(dt));
         } catch (ParseException e) {
             return null;
         }
         c.add(Calendar.MONTH,12);  // number of days to add
        dt = sdf.format(c.getTime());  
        return doConvertStringToJboDate(dt);     
    }    
    public static void main(String[] args) {
        //System.out.println(doGetAddedDate(doGetAddeddMonths(doConvertStringToJboDate("2016-03-01"),12) ,-1));
        //System.out.println((doGetAddeddMonths(doConvertStringToJboDate("2016-04-01"),12)));
                   
 
        
   }
    
    public static void doSetTHeUser(String pUser) {
      //  uname=pUser;
    }
    
    public static void doGetTHeUser() {
      //  System.out.println(uname +" this is the p user");
    }
    
     
    public  String myConnectedUser() {
    if (1==1) {
            return "ORACLE";
       }
        BindingContext      bc  =   BindingContext.getCurrent();
        DCBindingContainer dcb  =   bc.findBindingContainer("dgcom_view_LoginPageDef");
        DCDataControl       dc  =   dcb.findDataControl("modLoginDataControl");
        ApplicationModule   am  =   dc.getApplicationModule();
        ViewObject          vo  =   am.findViewObject("SysUsersVO1");
        vo.executeQuery();
            if (vo.getEstimatedRowCount()==1)
            {
                String userName=vo.first().getAttribute("Userid").toString();
                return userName;
            }
            else{
                //vo.remove();
                throw new JboException("Error while creating record.");
            }
    }
    
    public  String dOOperationAllowed(String p_operation_type) {

        BindingContext      bindingContext = BindingContext.getCurrent();
        DCBindingContainer  dcb            = bindingContext.findBindingContainer("dgcom_view_LoginPageDef");
        DCIteratorBinding   ib             = dcb.findIteratorBinding("SysUsersDetail1Iterator"); //can be used
        DCBindingContainer  dcbMod         = bindingContext.findBindingContainer("dgcom_view_tmpDigicomTemplatePageDef");
        AttributeBinding    moduleID       = (AttributeBinding) dcbMod.getControlBinding("Moduleid");
        ViewObject          vo             = ib.getViewObject();
        vo.reset();
        vo.setWhereClause("userid='"+getConnectedUser().toString()+"' and moduleid='"+moduleID.toString()+"'");
        vo.executeQuery();
        return vo.first().getAttribute(p_operation_type).toString();
        
    }

    public static String doGetModuleId() {
       if (1==1) {
        return "CIC_0013"    ;
       }    
        BindingContext bindingContext = BindingContext.getCurrent();
        DCBindingContainer dcbMod = bindingContext.findBindingContainer("dgcom_view_tmpDigicomTemplatePageDef");
        DCIteratorBinding ib = dcbMod.findIteratorBinding("ApplicationActivityQVO1Iterator"); //can be used
        ViewObject vo = ib.getViewObject();
        return (String) vo.first().getAttribute("Moduleid");

    }

    public static Row doFindOrderID(DBTransaction pDbtrans,String pAltKey,String pEntity,Object searchValue,String pSearchType) {
        //dgcom.model.stand.DigicomClass.doFindOrderID(getDBTransaction(), "AltKeyItemImeiInfoImei", "dgcom.model.eo.inv.ItemImeiInfo", "BoxNo", newValue, "A").toString().equals("YCI06105342");

        String entityName = pEntity;
        EntityDefImpl orderDef = EntityDefImpl.findDefObject(entityName);
        Key theKey = new Key(new Object[] { searchValue });
        EntityImpl row;
        if (pSearchType.equals("P")) {
            row = orderDef.findByPrimaryKey(pDbtrans, theKey);
       }
        else
        {
         row=orderDef.findByAltKey(pDbtrans,pAltKey,theKey,true,true);
        }
        //
        if (row != null) {
            return row;
        } else {
            return null;
        }
    }     

    public static void doExecutePLSQL(String pSqlString) {
        System.out.println(pSqlString);
        BindingContext      bc  =   BindingContext.getCurrent();
        DCBindingContainer dcb  =   bc.findBindingContainer("dgcom_view_LoginPageDef");
        DCDataControl       dc  =   dcb.findDataControl("modLoginDataControl");
        ApplicationModule   am  =   dc.getApplicationModule();
        DBTransaction dbt=(DBTransaction)am.getTransaction();
        CallableStatement cs=dbt.createCallableStatement(pSqlString, 1);
        //vo.executeQuery();
        try {
            cs.executeUpdate();
        } catch (SQLException e) {
            throw new JboException("Error While Executing PLSQL ("+pSqlString+").");
        }
        finally{
            try {
                cs.close();
            } catch (SQLException e) {
            }
        }
        
        
               
            
    } 
    
}
