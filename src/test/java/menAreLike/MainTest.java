package menAreLike;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author david.kotlirevsky
 */
public class MainTest {

    Man man;
    private Woman woman;

    @Test
    public void whenMenIsRichAndHandSomeAndWomanIsBeautifulAcceptProposal_ThenGetLeid(){
        /*given:*/
            boolean isRich =true;
            boolean handsome =true;
            boolean isDrunk =false;
            man = Man.create(isRich, handsome, isDrunk);
            boolean isBeautiful = true;
            boolean acceptFirstDateSex = true;
            boolean isWhore =false;
            woman = Woman.create(isBeautiful, acceptFirstDateSex, isWhore);
       /*when:*/
            boolean wasAccepted = man.proposeTo(woman);
        /*then:*/
            Assert.assertTrue(wasAccepted);
            Assert.assertTrue(man.getLeid());
            Assert.assertTrue(woman.getLeid());
    }

    @Test
    public void whenMenIsRichAndNotHandSome_AndWomanIsBeautifulAndWhoreAcceptProposal_ThenGetLeid(){
        /*given:*/
            boolean isRich =true;
            boolean handsome =false;
            boolean isDrunk =false;
            man = Man.create(isRich, handsome, isDrunk);
            boolean isBeautiful = true;
            boolean acceptFirstDateSex = true;
            boolean isWhore =true;
            woman = Woman.create(isBeautiful, acceptFirstDateSex, isWhore);
       /*when:*/
            boolean wasAccepted = man.proposeTo(woman);
        /*then:*/
            Assert.assertTrue(wasAccepted);
            Assert.assertTrue(man.getLeid());
            Assert.assertTrue(woman.getLeid());
    }

    @Test
    public void whenMenIsRichAndNotHandSome_AndWomanIsBeautifulNotAWhoreButAcceptFirstDateSexProposal_ThenNotGetLeid(){
        /*given:*/
            boolean isRich =true;
            boolean handsome =false;
            boolean isDrunk =false;
            man = Man.create(isRich, handsome, isDrunk);
            boolean isBeautiful = true;
            boolean acceptFirstDateSex = true;
            boolean isWhore =false;
            woman = Woman.create(isBeautiful, acceptFirstDateSex, isWhore);
       /*when:*/
            boolean wasAccepted = man.proposeTo(woman);
        /*then:*/
            Assert.assertFalse(wasAccepted);
            Assert.assertFalse(man.getLeid());
            Assert.assertFalse(woman.getLeid());
            Assert.assertTrue(man.fap());
    }

    @Test
    public void whenMenIsNotRichAndHandSome_AndWomanIsBeautifulNotAWhoreButAcceptFirstDateSexProposal_ThenGetLeid(){
        /*given:*/
            boolean isRich =false;
            boolean handsome =true;
            boolean isDrunk =false;
            man = Man.create(isRich, handsome, isDrunk);
            boolean isBeautiful = true;
            boolean acceptFirstDateSex = true;
            boolean isWhore =false;
            woman = Woman.create(isBeautiful, acceptFirstDateSex, isWhore);
       /*when:*/
            boolean wasAccepted = man.proposeTo(woman);
        /*then:*/
            Assert.assertTrue(wasAccepted);
            Assert.assertTrue(man.getLeid());
            Assert.assertTrue(woman.getLeid());
            Assert.assertFalse(man.fap());
    }

    @Test
    public void whenMenIsNotRichAndHandSome_AndWomanIsNoBeautifulButAWhoreButAcceptFirstDateSexProposal_ThenGetLeid(){
        /*given:*/
            boolean isRich =false;
            boolean handsome =true;
            boolean isDrunk =false;
            man = Man.create(isRich, handsome, isDrunk);
            boolean isBeautiful = false;
            boolean acceptFirstDateSex = true;
            boolean isWhore =false;
            woman = Woman.create(isBeautiful, acceptFirstDateSex, isWhore);
       /*when:*/
            boolean wasAccepted = man.proposeTo(woman);
        /*then:*/
            Assert.assertTrue(wasAccepted);
            Assert.assertTrue(man.getLeid());
            Assert.assertTrue(woman.getLeid());
            Assert.assertFalse(man.fap());
    }

    @Test
    public void whenMenIsNotRichAndNotHandSome_AndWomanIsNotBeautifulButAWhoreButAcceptFirstDateSexProposal_ThenGetLeid(){
        /*given:*/
            boolean isRich =false;
            boolean handsome =false;
            boolean isDrunk =false;
            man = Man.create(isRich, handsome, isDrunk);
            boolean isBeautiful = false;
            boolean acceptFirstDateSex = true;
            boolean isWhore =true;
            woman = Woman.create(isBeautiful, acceptFirstDateSex, isWhore);
       /*when:*/
            boolean wasAccepted = man.proposeTo(woman);
        /*then:*/
            Assert.assertTrue(wasAccepted);
            Assert.assertTrue(man.getLeid());
            Assert.assertTrue(woman.getLeid());
            Assert.assertFalse(man.fap());
    }

    @Test
    public void whenMenIsNotRichAndHandSomeAndDrunk_AndWomanIsNotBeautifulAndNotAWhoreButAcceptFirstDateSexProposal_ThenGetLeid(){
        /*given:*/
            boolean isRich =false;
            boolean handsome =false;
            boolean isDrunk =true;
            man = Man.create(isRich, handsome, isDrunk);
            boolean isBeautiful = false;
            boolean acceptFirstDateSex = true;
            boolean isWhore =false;
            woman = Woman.create(isBeautiful, acceptFirstDateSex, isWhore);
       /*when:*/
            boolean wasAccepted = man.proposeTo(woman);
        /*then:*/
            Assert.assertTrue(wasAccepted);
            Assert.assertTrue(man.getLeid());
            Assert.assertTrue(woman.getLeid());
            Assert.assertFalse(man.fap());
    }

}
