package org.acme.model;

import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@Entity
public class Form {

    @Id
    public String id;
    @Column(name = "createtime", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP", insertable = false, updatable = false)
    @Generated(GenerationTime.ALWAYS)
    public Timestamp createTime = Timestamp.valueOf(LocalDateTime.now());
    public int column1;
    public int column2;
    public int column3;
    public int column4;
    public int column5;
    public int column6;
    public int column7;
    public int column8;
    public int column9;
    public int column10;
    public int column11;
    public int column12;
    public int column13;
    public int column14;
    public int column15;
    public int column16;
    public int column17;
    public int column18;
    public int column19;
    public int column20;
    public int column21;
    public int column22;
    public int column23;
    public int column24;
    public int column25;
    public int column26;
    public int column27;
    public int column28;
    public int column29;
    public int column30;
    public int column31;
    public int column32;
    public int column33;
    public int column34;
    public int column35;
    public int column36;
    public int column37;
    public int column38;
    public int column39;
    public int column40;
    public int column41;
    public int column42;
    public int column43;
    public int column44;
    public int column45;
    public int column46;
    public int column47;
    public int column48;
    public int column49;
    public int column50;
    public int column51;
    public int column52;
    public int column53;
    public int column54;
    public int column55;
    public int column56;
    public int column57;
    public int column58;
    public int column59;
    public int column60;
    public int column61;
    public int column62;
    public int column63;
    public int column64;
    public int column65;
    public int column66;
    public int column67;
    public int column68;
    public int column69;
    public int column70;
    public int column71;
    public int column72;
    public int column73;
    public int column74;
    public int column75;
    public int column76;
    public int column77;
    public int column78;
    public int column79;
    public int column80;
    public int column81;
    public int column82;
    public int column83;
    public int column84;
    public int column85;
    public int column86;
    public int column87;
    public int column88;
    public int column89;
    public int column90;
    public int column91;
    public int column92;
    public int column93;
    public int column94;
    public int column95;
    public int column96;
    public int column97;
    public int column98;
    public int column99;
    public int column100;

    public Form() {
    }

    public Form(String id, Timestamp timestamp) {
        this.id = id;
        this.createTime = timestamp;
    }

    public Form(String id, int column1, int column2, int column3, int column4, int column5, int column6, int column7, int column8, int column9, int column10, int column11, int column12, int column13, int column14, int column15, int column16, int column17, int column18, int column19, int column20, int column21, int column22, int column23, int column24, int column25, int column26, int column27, int column28, int column29, int column30, int column31, int column32, int column33, int column34, int column35, int column36, int column37, int column38, int column39, int column40, int column41, int column42, int column43, int column44, int column45, int column46, int column47, int column48, int column49, int column50, int column51, int column52, int column53, int column54, int column55, int column56, int column57, int column58, int column59, int column60, int column61, int column62, int column63, int column64, int column65, int column66, int column67, int column68, int column69, int column70, int column71, int column72, int column73, int column74, int column75, int column76, int column77, int column78, int column79, int column80, int column81, int column82, int column83, int column84, int column85, int column86, int column87, int column88, int column89, int column90, int column91, int column92, int column93, int column94, int column95, int column96, int column97, int column98, int column99, int column100, Timestamp createTime) {
        this.id = id;
        this.column1 = column1;
        this.column2 = column2;
        this.column3 = column3;
        this.column4 = column4;
        this.column5 = column5;
        this.column6 = column6;
        this.column7 = column7;
        this.column8 = column8;
        this.column9 = column9;
        this.column10 = column10;
        this.column11 = column11;
        this.column12 = column12;
        this.column13 = column13;
        this.column14 = column14;
        this.column15 = column15;
        this.column16 = column16;
        this.column17 = column17;
        this.column18 = column18;
        this.column19 = column19;
        this.column20 = column20;
        this.column21 = column21;
        this.column22 = column22;
        this.column23 = column23;
        this.column24 = column24;
        this.column25 = column25;
        this.column26 = column26;
        this.column27 = column27;
        this.column28 = column28;
        this.column29 = column29;
        this.column30 = column30;
        this.column31 = column31;
        this.column32 = column32;
        this.column33 = column33;
        this.column34 = column34;
        this.column35 = column35;
        this.column36 = column36;
        this.column37 = column37;
        this.column38 = column38;
        this.column39 = column39;
        this.column40 = column40;
        this.column41 = column41;
        this.column42 = column42;
        this.column43 = column43;
        this.column44 = column44;
        this.column45 = column45;
        this.column46 = column46;
        this.column47 = column47;
        this.column48 = column48;
        this.column49 = column49;
        this.column50 = column50;
        this.column51 = column51;
        this.column52 = column52;
        this.column53 = column53;
        this.column54 = column54;
        this.column55 = column55;
        this.column56 = column56;
        this.column57 = column57;
        this.column58 = column58;
        this.column59 = column59;
        this.column60 = column60;
        this.column61 = column61;
        this.column62 = column62;
        this.column63 = column63;
        this.column64 = column64;
        this.column65 = column65;
        this.column66 = column66;
        this.column67 = column67;
        this.column68 = column68;
        this.column69 = column69;
        this.column70 = column70;
        this.column71 = column71;
        this.column72 = column72;
        this.column73 = column73;
        this.column74 = column74;
        this.column75 = column75;
        this.column76 = column76;
        this.column77 = column77;
        this.column78 = column78;
        this.column79 = column79;
        this.column80 = column80;
        this.column81 = column81;
        this.column82 = column82;
        this.column83 = column83;
        this.column84 = column84;
        this.column85 = column85;
        this.column86 = column86;
        this.column87 = column87;
        this.column88 = column88;
        this.column89 = column89;
        this.column90 = column90;
        this.column91 = column91;
        this.column92 = column92;
        this.column93 = column93;
        this.column94 = column94;
        this.column95 = column95;
        this.column96 = column96;
        this.column97 = column97;
        this.column98 = column98;
        this.column99 = column99;
        this.column100 = column100;
        this.createTime = createTime;
    }

    public Form(String id, int num) {
        this.id = id;
        this.column1 = num;
    }

    @Override
    public String toString() {
        return "Form{" +
                "id='" + id + '\'' +
                ", column1=" + column1 +
                ", column2=" + column2 +
                ", column3=" + column3 +
                ", column4=" + column4 +
                ", column5=" + column5 +
                ", column6=" + column6 +
                ", column7=" + column7 +
                ", column8=" + column8 +
                ", column9=" + column9 +
                ", column10=" + column10 +
                ", column11=" + column11 +
                ", column12=" + column12 +
                ", column13=" + column13 +
                ", column14=" + column14 +
                ", column15=" + column15 +
                ", column16=" + column16 +
                ", column17=" + column17 +
                ", column18=" + column18 +
                ", column19=" + column19 +
                ", column20=" + column20 +
                ", column21=" + column21 +
                ", column22=" + column22 +
                ", column23=" + column23 +
                ", column24=" + column24 +
                ", column25=" + column25 +
                ", column26=" + column26 +
                ", column27=" + column27 +
                ", column28=" + column28 +
                ", column29=" + column29 +
                ", column30=" + column30 +
                ", column31=" + column31 +
                ", column32=" + column32 +
                ", column33=" + column33 +
                ", column34=" + column34 +
                ", column35=" + column35 +
                ", column36=" + column36 +
                ", column37=" + column37 +
                ", column38=" + column38 +
                ", column39=" + column39 +
                ", column40=" + column40 +
                ", column41=" + column41 +
                ", column42=" + column42 +
                ", column43=" + column43 +
                ", column44=" + column44 +
                ", column45=" + column45 +
                ", column46=" + column46 +
                ", column47=" + column47 +
                ", column48=" + column48 +
                ", column49=" + column49 +
                ", column50=" + column50 +
                ", column51=" + column51 +
                ", column52=" + column52 +
                ", column53=" + column53 +
                ", column54=" + column54 +
                ", column55=" + column55 +
                ", column56=" + column56 +
                ", column57=" + column57 +
                ", column58=" + column58 +
                ", column59=" + column59 +
                ", column60=" + column60 +
                ", column61=" + column61 +
                ", column62=" + column62 +
                ", column63=" + column63 +
                ", column64=" + column64 +
                ", column65=" + column65 +
                ", column66=" + column66 +
                ", column67=" + column67 +
                ", column68=" + column68 +
                ", column69=" + column69 +
                ", column70=" + column70 +
                ", column71=" + column71 +
                ", column72=" + column72 +
                ", column73=" + column73 +
                ", column74=" + column74 +
                ", column75=" + column75 +
                ", column76=" + column76 +
                ", column77=" + column77 +
                ", column78=" + column78 +
                ", column79=" + column79 +
                ", column80=" + column80 +
                ", column81=" + column81 +
                ", column82=" + column82 +
                ", column83=" + column83 +
                ", column84=" + column84 +
                ", column85=" + column85 +
                ", column86=" + column86 +
                ", column87=" + column87 +
                ", column88=" + column88 +
                ", column89=" + column89 +
                ", column90=" + column90 +
                ", column91=" + column91 +
                ", column92=" + column92 +
                ", column93=" + column93 +
                ", column94=" + column94 +
                ", column95=" + column95 +
                ", column96=" + column96 +
                ", column97=" + column97 +
                ", column98=" + column98 +
                ", column99=" + column99 +
                ", column100=" + column100 +
                ", createTime=" + createTime +
                '}';
    }

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getColumn1() {
        return column1;
    }

    public void setColumn1(int column1) {
        this.column1 = column1;
    }

    public int getColumn2() {
        return column2;
    }

    public void setColumn2(int column2) {
        this.column2 = column2;
    }

    public int getColumn3() {
        return column3;
    }

    public void setColumn3(int column3) {
        this.column3 = column3;
    }

    public int getColumn4() {
        return column4;
    }

    public void setColumn4(int column4) {
        this.column4 = column4;
    }

    public int getColumn5() {
        return column5;
    }

    public void setColumn5(int column5) {
        this.column5 = column5;
    }

    public int getColumn6() {
        return column6;
    }

    public void setColumn6(int column6) {
        this.column6 = column6;
    }

    public int getColumn7() {
        return column7;
    }

    public void setColumn7(int column7) {
        this.column7 = column7;
    }

    public int getColumn8() {
        return column8;
    }

    public void setColumn8(int column8) {
        this.column8 = column8;
    }

    public int getColumn9() {
        return column9;
    }

    public void setColumn9(int column9) {
        this.column9 = column9;
    }

    public int getColumn10() {
        return column10;
    }

    public void setColumn10(int column10) {
        this.column10 = column10;
    }

    public int getColumn11() {
        return column11;
    }

    public void setColumn11(int column11) {
        this.column11 = column11;
    }

    public int getColumn12() {
        return column12;
    }

    public void setColumn12(int column12) {
        this.column12 = column12;
    }

    public int getColumn13() {
        return column13;
    }

    public void setColumn13(int column13) {
        this.column13 = column13;
    }

    public int getColumn14() {
        return column14;
    }

    public void setColumn14(int column14) {
        this.column14 = column14;
    }

    public int getColumn15() {
        return column15;
    }

    public void setColumn15(int column15) {
        this.column15 = column15;
    }

    public int getColumn16() {
        return column16;
    }

    public void setColumn16(int column16) {
        this.column16 = column16;
    }

    public int getColumn17() {
        return column17;
    }

    public void setColumn17(int column17) {
        this.column17 = column17;
    }

    public int getColumn18() {
        return column18;
    }

    public void setColumn18(int column18) {
        this.column18 = column18;
    }

    public int getColumn19() {
        return column19;
    }

    public void setColumn19(int column19) {
        this.column19 = column19;
    }

    public int getColumn20() {
        return column20;
    }

    public void setColumn20(int column20) {
        this.column20 = column20;
    }

    public int getColumn21() {
        return column21;
    }

    public void setColumn21(int column21) {
        this.column21 = column21;
    }

    public int getColumn22() {
        return column22;
    }

    public void setColumn22(int column22) {
        this.column22 = column22;
    }

    public int getColumn23() {
        return column23;
    }

    public void setColumn23(int column23) {
        this.column23 = column23;
    }

    public int getColumn24() {
        return column24;
    }

    public void setColumn24(int column24) {
        this.column24 = column24;
    }

    public int getColumn25() {
        return column25;
    }

    public void setColumn25(int column25) {
        this.column25 = column25;
    }

    public int getColumn26() {
        return column26;
    }

    public void setColumn26(int column26) {
        this.column26 = column26;
    }

    public int getColumn27() {
        return column27;
    }

    public void setColumn27(int column27) {
        this.column27 = column27;
    }

    public int getColumn28() {
        return column28;
    }

    public void setColumn28(int column28) {
        this.column28 = column28;
    }

    public int getColumn29() {
        return column29;
    }

    public void setColumn29(int column29) {
        this.column29 = column29;
    }

    public int getColumn30() {
        return column30;
    }

    public void setColumn30(int column30) {
        this.column30 = column30;
    }

    public int getColumn31() {
        return column31;
    }

    public void setColumn31(int column31) {
        this.column31 = column31;
    }

    public int getColumn32() {
        return column32;
    }

    public void setColumn32(int column32) {
        this.column32 = column32;
    }

    public int getColumn33() {
        return column33;
    }

    public void setColumn33(int column33) {
        this.column33 = column33;
    }

    public int getColumn34() {
        return column34;
    }

    public void setColumn34(int column34) {
        this.column34 = column34;
    }

    public int getColumn35() {
        return column35;
    }

    public void setColumn35(int column35) {
        this.column35 = column35;
    }

    public int getColumn36() {
        return column36;
    }

    public void setColumn36(int column36) {
        this.column36 = column36;
    }

    public int getColumn37() {
        return column37;
    }

    public void setColumn37(int column37) {
        this.column37 = column37;
    }

    public int getColumn38() {
        return column38;
    }

    public void setColumn38(int column38) {
        this.column38 = column38;
    }

    public int getColumn39() {
        return column39;
    }

    public void setColumn39(int column39) {
        this.column39 = column39;
    }

    public int getColumn40() {
        return column40;
    }

    public void setColumn40(int column40) {
        this.column40 = column40;
    }

    public int getColumn41() {
        return column41;
    }

    public void setColumn41(int column41) {
        this.column41 = column41;
    }

    public int getColumn42() {
        return column42;
    }

    public void setColumn42(int column42) {
        this.column42 = column42;
    }

    public int getColumn43() {
        return column43;
    }

    public void setColumn43(int column43) {
        this.column43 = column43;
    }

    public int getColumn44() {
        return column44;
    }

    public void setColumn44(int column44) {
        this.column44 = column44;
    }

    public int getColumn45() {
        return column45;
    }

    public void setColumn45(int column45) {
        this.column45 = column45;
    }

    public int getColumn46() {
        return column46;
    }

    public void setColumn46(int column46) {
        this.column46 = column46;
    }

    public int getColumn47() {
        return column47;
    }

    public void setColumn47(int column47) {
        this.column47 = column47;
    }

    public int getColumn48() {
        return column48;
    }

    public void setColumn48(int column48) {
        this.column48 = column48;
    }

    public int getColumn49() {
        return column49;
    }

    public void setColumn49(int column49) {
        this.column49 = column49;
    }

    public int getColumn50() {
        return column50;
    }

    public void setColumn50(int column50) {
        this.column50 = column50;
    }

    public int getColumn51() {
        return column51;
    }

    public void setColumn51(int column51) {
        this.column51 = column51;
    }

    public int getColumn52() {
        return column52;
    }

    public void setColumn52(int column52) {
        this.column52 = column52;
    }

    public int getColumn53() {
        return column53;
    }

    public void setColumn53(int column53) {
        this.column53 = column53;
    }

    public int getColumn54() {
        return column54;
    }

    public void setColumn54(int column54) {
        this.column54 = column54;
    }

    public int getColumn55() {
        return column55;
    }

    public void setColumn55(int column55) {
        this.column55 = column55;
    }

    public int getColumn56() {
        return column56;
    }

    public void setColumn56(int column56) {
        this.column56 = column56;
    }

    public int getColumn57() {
        return column57;
    }

    public void setColumn57(int column57) {
        this.column57 = column57;
    }

    public int getColumn58() {
        return column58;
    }

    public void setColumn58(int column58) {
        this.column58 = column58;
    }

    public int getColumn59() {
        return column59;
    }

    public void setColumn59(int column59) {
        this.column59 = column59;
    }

    public int getColumn60() {
        return column60;
    }

    public void setColumn60(int column60) {
        this.column60 = column60;
    }

    public int getColumn61() {
        return column61;
    }

    public void setColumn61(int column61) {
        this.column61 = column61;
    }

    public int getColumn62() {
        return column62;
    }

    public void setColumn62(int column62) {
        this.column62 = column62;
    }

    public int getColumn63() {
        return column63;
    }

    public void setColumn63(int column63) {
        this.column63 = column63;
    }

    public int getColumn64() {
        return column64;
    }

    public void setColumn64(int column64) {
        this.column64 = column64;
    }

    public int getColumn65() {
        return column65;
    }

    public void setColumn65(int column65) {
        this.column65 = column65;
    }

    public int getColumn66() {
        return column66;
    }

    public void setColumn66(int column66) {
        this.column66 = column66;
    }

    public int getColumn67() {
        return column67;
    }

    public void setColumn67(int column67) {
        this.column67 = column67;
    }

    public int getColumn68() {
        return column68;
    }

    public void setColumn68(int column68) {
        this.column68 = column68;
    }

    public int getColumn69() {
        return column69;
    }

    public void setColumn69(int column69) {
        this.column69 = column69;
    }

    public int getColumn70() {
        return column70;
    }

    public void setColumn70(int column70) {
        this.column70 = column70;
    }

    public int getColumn71() {
        return column71;
    }

    public void setColumn71(int column71) {
        this.column71 = column71;
    }

    public int getColumn72() {
        return column72;
    }

    public void setColumn72(int column72) {
        this.column72 = column72;
    }

    public int getColumn73() {
        return column73;
    }

    public void setColumn73(int column73) {
        this.column73 = column73;
    }

    public int getColumn74() {
        return column74;
    }

    public void setColumn74(int column74) {
        this.column74 = column74;
    }

    public int getColumn75() {
        return column75;
    }

    public void setColumn75(int column75) {
        this.column75 = column75;
    }

    public int getColumn76() {
        return column76;
    }

    public void setColumn76(int column76) {
        this.column76 = column76;
    }

    public int getColumn77() {
        return column77;
    }

    public void setColumn77(int column77) {
        this.column77 = column77;
    }

    public int getColumn78() {
        return column78;
    }

    public void setColumn78(int column78) {
        this.column78 = column78;
    }

    public int getColumn79() {
        return column79;
    }

    public void setColumn79(int column79) {
        this.column79 = column79;
    }

    public int getColumn80() {
        return column80;
    }

    public void setColumn80(int column80) {
        this.column80 = column80;
    }

    public int getColumn81() {
        return column81;
    }

    public void setColumn81(int column81) {
        this.column81 = column81;
    }

    public int getColumn82() {
        return column82;
    }

    public void setColumn82(int column82) {
        this.column82 = column82;
    }

    public int getColumn83() {
        return column83;
    }

    public void setColumn83(int column83) {
        this.column83 = column83;
    }

    public int getColumn84() {
        return column84;
    }

    public void setColumn84(int column84) {
        this.column84 = column84;
    }

    public int getColumn85() {
        return column85;
    }

    public void setColumn85(int column85) {
        this.column85 = column85;
    }

    public int getColumn86() {
        return column86;
    }

    public void setColumn86(int column86) {
        this.column86 = column86;
    }

    public int getColumn87() {
        return column87;
    }

    public void setColumn87(int column87) {
        this.column87 = column87;
    }

    public int getColumn88() {
        return column88;
    }

    public void setColumn88(int column88) {
        this.column88 = column88;
    }

    public int getColumn89() {
        return column89;
    }

    public void setColumn89(int column89) {
        this.column89 = column89;
    }

    public int getColumn90() {
        return column90;
    }

    public void setColumn90(int column90) {
        this.column90 = column90;
    }

    public int getColumn91() {
        return column91;
    }

    public void setColumn91(int column91) {
        this.column91 = column91;
    }

    public int getColumn92() {
        return column92;
    }

    public void setColumn92(int column92) {
        this.column92 = column92;
    }

    public int getColumn93() {
        return column93;
    }

    public void setColumn93(int column93) {
        this.column93 = column93;
    }

    public int getColumn94() {
        return column94;
    }

    public void setColumn94(int column94) {
        this.column94 = column94;
    }

    public int getColumn95() {
        return column95;
    }

    public void setColumn95(int column95) {
        this.column95 = column95;
    }

    public int getColumn96() {
        return column96;
    }

    public void setColumn96(int column96) {
        this.column96 = column96;
    }

    public int getColumn97() {
        return column97;
    }

    public void setColumn97(int column97) {
        this.column97 = column97;
    }

    public int getColumn98() {
        return column98;
    }

    public void setColumn98(int column98) {
        this.column98 = column98;
    }

    public int getColumn99() {
        return column99;
    }

    public void setColumn99(int column99) {
        this.column99 = column99;
    }

    public int getColumn100() {
        return column100;
    }

    public void setColumn100(int column100) {
        this.column100 = column100;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

}
