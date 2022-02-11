package dgcom.model.rules;

import dgcom.model.stand.DigicomClass;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;

import oracle.jbo.JboException;
import oracle.jbo.rules.JboValidatorContext;
import oracle.jbo.rules.JboValidatorInterface;
import oracle.jbo.server.DBTransaction;
import oracle.jbo.server.EntityImpl;

public class RulCheckDateRights implements JboValidatorInterface {
    private String description = "";
    private String dateFieldName="";

    public void setDateFieldName(String dateFieldName) {
        this.dateFieldName = dateFieldName;
    }

    public String getDateFieldName() {
        return dateFieldName;
    }

    public RulCheckDateRights() {
    }

    /**
     * Return true if value is valid.
     */
    public boolean validateValue(Object value) {
        return true;
    }

    /**
     * Invoked by framework for validation.
     */
    public void validate(JboValidatorContext ctx) {
        if (validatorAttachedAtEntityLevel(ctx)) {
            DBTransaction dbt = null;
            String val = "-1";
            CallableStatement cs=null;
            EntityImpl eo = (EntityImpl) ctx.getSource();
            System.out.println("EntityImpl:getSourceFullName:"+ctx.getSourceFullName());
            String eoname=ctx.getSourceFullName().substring(ctx.getSourceFullName().lastIndexOf(".")+1).toUpperCase();
            dbt = eo.getDBTransaction();
            if (eoname.equals("SRVDAP")) {
                val = eo.getAttribute("DapDate").toString();
            }
            else if(eoname.equals("SRVJOBCARD")) {
                val = eo.getAttribute("Jobdate").toString();
            }
            else if(eoname.equals("SRVJOBASSIGN")) {
                val = eo.getAttribute("Assdate").toString();
            }
            else if(eoname.equals("ALLDEMANDNOTE")) {
                val = eo.getAttribute("DemandDate").toString();
            }
            else if(eoname.equals("PUPURCHASEORDERS")) {
                val = eo.getAttribute("PoDate").toString();
            }
            else if(eoname.equals("PUSUPPLIERINVOICES")) {
                val = eo.getAttribute("InvoiceDate").toString();
            }
            else if(eoname.equals("SRVBOM")) {
                val = eo.getAttribute("Bomdate").toString();
            }
            else if(eoname.equals("SRVCOURIERDELI")) {
                val = eo.getAttribute("Cddate").toString();
            }
            else if(eoname.equals("SRVDISCOUNTNOTE")) {
                val = eo.getAttribute("DnDate").toString();
            }
            else if(eoname.equals("SRVEPFSETS")) {
                val = eo.getAttribute("Edate").toString();
            }
            else if(eoname.equals("SRVGRN")) {
                val = eo.getAttribute("GrnDate").toString();
            }
            else if(eoname.equals("SRVINVOICE")) {
                val = eo.getAttribute("InvDate").toString();
            }
            else if(eoname.equals("SRVISSUANCE")) {
                val = eo.getAttribute("Issuedate").toString();
            }
            else if(eoname.equals("SRVISSUERETURN")) {
                val = eo.getAttribute("Retdate").toString();
            }
            else if(eoname.equals("SRVJOBCOMPLAIN")) {
                val = eo.getAttribute("Jcdate").toString();
            }
            else if(eoname.equals("SRVJOBESTIMATION")) {
                val = eo.getAttribute("Esdate").toString();
            }
            else if(eoname.equals("SRVJOBHANDOVERTOLAB")) {
                val = eo.getAttribute("Hodate").toString();
            }
            else if(eoname.equals("SRVJOBQC")) {
                val = eo.getAttribute("Qcdate").toString();
            }
            else if(eoname.equals("SRVJOBRETURN")) {
                val = eo.getAttribute("Jrdate").toString();
            }
            else if(eoname.equals("SRVJOBSINVENTORY")) {
                val = eo.getAttribute("JinvDate").toString();
            }
            else if(eoname.equals("SRVJOBSOLUTION")) {
                val = eo.getAttribute("JsDate").toString();
            }
            else if(eoname.equals("SRVJOBSWAP")) {
                val = eo.getAttribute("Sdate").toString();
            }
            else if(eoname.equals("SRVJOBTRANSFER")) {
                val = eo.getAttribute("Tdate").toString();
            }
            else if(eoname.equals("SRVLOGISTIC")) {
                val = eo.getAttribute("Logdate").toString();
            }
            else if(eoname.equals("SRVPARTSALES")) {
                val = eo.getAttribute("Psdate").toString();
            }
            else if(eoname.equals("SRVPARTSPRICE")) {
                val = eo.getAttribute("DocDate").toString();
            }
            else if(eoname.equals("SRVRECEIPTMASTER")) {
                val = eo.getAttribute("ReceiptDate").toString();
            }
            else if(eoname.equals("SRVREVIEWJOBWARRANTY")) {
                val = eo.getAttribute("RvDate").toString();
            }
            else if(eoname.equals("SRVSETDELIVERY")) {
                val = eo.getAttribute("Sddate").toString();
            }
            else if(eoname.equals("SRVSETREPLACEMENT")) {
                val = eo.getAttribute("SrDate").toString();
            }
            else if(eoname.equals("SRVSTN")) {
                val = eo.getAttribute("Stndate").toString();
            }
            else if(eoname.equals("SRVSTNRECEIVING")) {
                val = eo.getAttribute("Recedate").toString();
            }
            else if(eoname.equals("SRVSTOCKADJUST")) {
                val = eo.getAttribute("Sadate").toString();
            }
            else if(eoname.equals("SRVSTOCKOPENING")) {
                val = eo.getAttribute("Odate").toString();
            }
            else if(eoname.equals("SRVSTOCKTRANSFER")) {
                val = eo.getAttribute("Tdate").toString();
            }
            else if(eoname.equals("SRVSTOCKTRANSFER")) {
                val = eo.getAttribute("Tdate").toString();
            }
            else if(eoname.equals("INITEMPARTMOVEMENT")) {
                val = eo.getAttribute("MapDate").toString();
            }    
            else if(eoname.equals("SRVRFWARRANTY")) {
                val = eo.getAttribute("Rdate").toString();
            }                
            
            //val = eo.getAttribute(getDateFieldName()).toString();
            try {
                
                val = DigicomClass.doGetFormattedDate(val, "dd-MMM-YYYY");
                cs =
                    dbt.createCallableStatement("begin user_back_date('" + DigicomClass.getConnectedUser() + "','" +
                                                DigicomClass.doGetModuleId() + "','" + val + "',?); end;", 1);
                cs.registerOutParameter(1, Types.VARCHAR);
                cs.executeUpdate();
               

                if (!(cs.getString(1) == null)) {
                    throw new JboException(cs.getString(1));
                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
            
            finally {
                try {
                    cs.close();
                } catch (Exception e) {
                }
            }
        } else {
            System.out.println("This is entity level");
            String val = ctx.getNewValue().toString();
            EntityImpl eo = (EntityImpl) ctx.getSource();
            DBTransaction dbt = eo.getDBTransaction();
            val = ctx.getNewValue().toString();
            val = DigicomClass.doGetFormattedDate(val, "dd-MMM-YYYY");
            CallableStatement cs =
                dbt.createCallableStatement("begin user_back_date('" +DigicomClass.getConnectedUser() + "','" + DigicomClass.doGetModuleId()+ "','" +val + "',?); end;", 1);
            try {
                cs.registerOutParameter(1, Types.VARCHAR);
                cs.executeUpdate();
                if (!(cs.getString(1) == null)) {
                    throw new JboException(cs.getString(1));
                }
            } catch (SQLException e) {

            } finally {
                try {
                    cs.close();
                } catch (SQLException e) {
                }
            }
        }
    }


    /**
     * Description of what this class validates.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Description of what this class validates.
     */
    public void setDescription(String str) {
        description = str;
    }

    private boolean validatorAttachedAtEntityLevel(JboValidatorContext ctx) {
        System.out.println("pakistan ");
        return ctx.getOldValue() instanceof EntityImpl;
    }
}
