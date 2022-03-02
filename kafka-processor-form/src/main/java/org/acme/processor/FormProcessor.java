package org.acme.processor;

import io.smallrye.reactive.messaging.annotations.Blocking;
import org.acme.model.Form;
import org.eclipse.microprofile.reactive.messaging.Incoming;
import org.eclipse.microprofile.reactive.messaging.Outgoing;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.Random;

@ApplicationScoped
public class FormProcessor {

    @Inject
    EntityManager entityManager;
    private Random random = new Random();

    @Transactional
    @Incoming("requests")
    @Outgoing("forms")
    @Blocking
    public Form process(String formRequest) {
        Form form = new Form();
        int num = random.nextInt(2000000);

        form.setId(formRequest);
        form.setCreateTime(form.createTime);
        form.setColumn1(num);
        form.setColumn2(num);
        form.setColumn3(num);
        form.setColumn4(num);
        form.setColumn5(num);
        form.setColumn6(num);
        form.setColumn7(num);
        form.setColumn8(num);
        form.setColumn9(num);
        form.setColumn10(num);
        form.setColumn11(num);
        form.setColumn12(num);
        form.setColumn13(num);
        form.setColumn14(num);
        form.setColumn15(num);
        form.setColumn16(num);
        form.setColumn17(num);
        form.setColumn18(num);
        form.setColumn19(num);
        form.setColumn20(num);
        form.setColumn21(num);
        form.setColumn22(num);
        form.setColumn23(num);
        form.setColumn24(num);
        form.setColumn25(num);
        form.setColumn26(num);
        form.setColumn27(num);
        form.setColumn28(num);
        form.setColumn29(num);
        form.setColumn30(num);
        form.setColumn31(num);
        form.setColumn32(num);
        form.setColumn33(num);
        form.setColumn34(num);
        form.setColumn35(num);
        form.setColumn36(num);
        form.setColumn37(num);
        form.setColumn38(num);
        form.setColumn39(num);
        form.setColumn40(num);
        form.setColumn41(num);
        form.setColumn42(num);
        form.setColumn43(num);
        form.setColumn44(num);
        form.setColumn45(num);
        form.setColumn46(num);
        form.setColumn47(num);
        form.setColumn48(num);
        form.setColumn49(num);
        form.setColumn50(num);
        form.setColumn51(num);
        form.setColumn52(num);
        form.setColumn53(num);
        form.setColumn54(num);
        form.setColumn55(num);
        form.setColumn56(num);
        form.setColumn57(num);
        form.setColumn58(num);
        form.setColumn59(num);
        form.setColumn60(num);
        form.setColumn61(num);
        form.setColumn62(num);
        form.setColumn63(num);
        form.setColumn64(num);
        form.setColumn65(num);
        form.setColumn66(num);
        form.setColumn67(num);
        form.setColumn68(num);
        form.setColumn69(num);
        form.setColumn70(num);
        form.setColumn71(num);
        form.setColumn72(num);
        form.setColumn73(num);
        form.setColumn74(num);
        form.setColumn75(num);
        form.setColumn76(num);
        form.setColumn77(num);
        form.setColumn78(num);
        form.setColumn79(num);
        form.setColumn80(num);
        form.setColumn81(num);
        form.setColumn82(num);
        form.setColumn83(num);
        form.setColumn84(num);
        form.setColumn85(num);
        form.setColumn86(num);
        form.setColumn87(num);
        form.setColumn88(num);
        form.setColumn89(num);
        form.setColumn90(num);
        form.setColumn91(num);
        form.setColumn92(num);
        form.setColumn93(num);
        form.setColumn94(num);
        form.setColumn95(num);
        form.setColumn96(num);
        form.setColumn97(num);
        form.setColumn98(num);
        form.setColumn99(num);
        form.setColumn100(num);

        entityManager.persist(form);

        return new Form(formRequest, num);
    }

}
