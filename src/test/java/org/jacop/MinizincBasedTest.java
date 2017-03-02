package org.jacop;

import org.jacop.fz.Fz2jacop;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * @author Mariusz Świerkot
 */

@RunWith(Parameterized.class) public class MinizincBasedTest {
    private String inputString;
    private static Fz2jacop fz2jacop;
    private static final String relativePath = "src/test/fz/";
    private static final boolean printInfo = true;

    @BeforeClass public static void initialize() {
        fz2jacop = new Fz2jacop();
    }


    public MinizincBasedTest(String inputString) {
        this.inputString = inputString;

    }

    @Parameterized.Parameters public static Collection parametricTest() {


        return Arrays.asList(new Object[][] {

            //%%	java.lang.ArithmeticException: Overflow occurred from int 50000000 * 50000000

            //%%	java.lang.ArithmeticException: Overflow occurred from int 50000000 * 50000000

            //mip
            //java.lang.AssertionError: Request for a value of not grounded variable -X_INTRODUCED_7::{-5.570655048359189E-11..-0.0}
            // {"test/mip/mip1"},
            //java.lang.AssertionError: Request for a value of not grounded variable -X_INTRODUCED_1::{0.2156132152879184..0.21561321530379057}
            // {"test/mip/mip2"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
            // {"test/mip/mip3"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
            // {"test/mip/mip4"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
            // {"test/mip/mip5"},



            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
            // {"test/bacp/bacp-12"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
            // {"test/bacp/bacp-13"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
            // {"test/bacp/bacp-14"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
            // {"test/bacp/bacp-15"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
            // {"test/bacp/bacp-16"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
            // {"test/bacp/bacp-17"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
            // {"test/bacp/bacp-18"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
            // {"test/bacp/bacp-19"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
            // {"test/bacp/bacp-20"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
            // {"test/bacp/bacp-21"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
            // {"test/bacp/bacp-22"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
            // {"test/bacp/bacp-23"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
            // {"test/bacp/bacp-24"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
            // {"test/bacp/bacp-25"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
            // {"test/bacp/bacp-26"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
            // {"test/bacp/bacp-27"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
            // {"test/bacp/bacp-28"},

            //black-hole
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
            // {"test/black-hole/0"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0

            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/black-hole/3"},

            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/black-hole/5"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/black-hole/6"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/black-hole/7"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/black-hole/8"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/black-hole/9"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/black-hole/10"},

            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/black-hole/12"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/black-hole/13"},

            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
            //java.lang.IndexOutOfBoundsException: {"test/black-hole/19"},

            //carpet-cutting
            //java.lang.AssertionError: Min value can not be greater than max value{"test/carpet-cutting/mzn_rnd_test.01"},
            //java.lang.AssertionError: Min value can not be greater than max value{"test/carpet-cutting/mzn_rnd_test.02"},

            //java.lang.AssertionError: Min value can not be greater than max value{"test/carpet-cutting/mzn_rnd_test.11"},
            //java.lang.AssertionError: Min value can not be greater than max value{"test/carpet-cutting/mzn_rnd_test.12"},


            //cutstock
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/cutstock/small_test0"},
            {"test/cutstock/type01_TEST7"}, {"test/cutstock/type01_TEST8"}, {"test/cutstock/type01_TEST10"}, {"test/cutstock/type02_TEST1"},
            {"test/cutstock/type02_TEST2"}, {"test/cutstock/type02_TEST3"}, {"test/cutstock/type02_TEST4"}, {"test/cutstock/type02_TEST5"},
            {"test/cutstock/type02_TEST6"}, {"test/cutstock/type02_TEST7"}, {"test/cutstock/type02_TEST8"}, {"test/cutstock/type02_TEST9"},
            {"test/cutstock/type02_TEST10"}, {"test/cutstock/type03_TEST1"}, {"test/cutstock/type03_TEST2"}, {"test/cutstock/type03_TEST3"},
            {"test/cutstock/type03_TEST4"}, {"test/cutstock/type03_TEST5"}, {"test/cutstock/type03_TEST6"}, {"test/cutstock/type03_TEST7"},
            {"test/cutstock/type03_TEST8"}, {"test/cutstock/type03_TEST9"}, {"test/cutstock/type03_TEST10"}, {"test/cutstock/type04_TEST1"},
            {"test/cutstock/type04_TEST2"}, {"test/cutstock/type04_TEST3"}, {"test/cutstock/type04_TEST4"}, {"test/cutstock/type04_TEST5"},
            {"test/cutstock/type04_TEST6"}, {"test/cutstock/type04_TEST7"}, {"test/cutstock/type04_TEST8"}, {"test/cutstock/type04_TEST9"},
            {"test/cutstock/type04_TEST10"}, {"test/cutstock/type07_TEST1"}, {"test/cutstock/type07_TEST2"}, {"test/cutstock/type07_TEST3"},
            {"test/cutstock/type07_TEST4"}, {"test/cutstock/type07_TEST5"}, {"test/cutstock/type07_TEST7"}, {"test/cutstock/type07_TEST8"},
            {"test/cutstock/type07_TEST9"}, {"test/cutstock/type07_TEST10"}, {"test/cutstock/type08_TEST1"}, {"test/cutstock/type08_TEST2"},
            {"test/cutstock/type08_TEST3"}, {"test/cutstock/type08_TEST4"}, {"test/cutstock/type08_TEST5"}, {"test/cutstock/type08_TEST6"},
            {"test/cutstock/type08_TEST7"}, {"test/cutstock/type08_TEST8"}, {"test/cutstock/type08_TEST9"}, {"test/cutstock/type08_TEST10"},
            {"test/cutstock/type09_TEST1"}, {"test/cutstock/type09_TEST2"}, {"test/cutstock/type09_TEST3"}, {"test/cutstock/type09_TEST4"},
            {"test/cutstock/type09_TEST5"}, {"test/cutstock/type09_TEST6"}, {"test/cutstock/type09_TEST7"}, {"test/cutstock/type09_TEST8"},
            {"test/cutstock/type09_TEST9"}, {"test/cutstock/type09_TEST10"}, {"test/cutstock/type10_TEST1"}, {"test/cutstock/type10_TEST2"},
            {"test/cutstock/type10_TEST3"}, {"test/cutstock/type10_TEST4"}, {"test/cutstock/type10_TEST5"}, {"test/cutstock/type10_TEST6"},
            {"test/cutstock/type10_TEST7"}, {"test/cutstock/type10_TEST8"}, {"test/cutstock/type10_TEST9"}, {"test/cutstock/type10_TEST10"},
            {"test/cutstock/type13_TEST1"}, {"test/cutstock/type13_TEST2"}, {"test/cutstock/type13_TEST3"}, {"test/cutstock/type13_TEST4"},
            {"test/cutstock/type13_TEST5"}, {"test/cutstock/type13_TEST6"}, {"test/cutstock/type13_TEST7"}, {"test/cutstock/type13_TEST8"},
            {"test/cutstock/type13_TEST9"}, {"test/cutstock/type13_TEST10"}, {"test/cutstock/type14_TEST1"}, {"test/cutstock/type14_TEST2"},
            {"test/cutstock/type14_TEST3"}, {"test/cutstock/type14_TEST4"}, {"test/cutstock/type14_TEST5"}, {"test/cutstock/type14_TEST6"},
            {"test/cutstock/type14_TEST7"}, {"test/cutstock/type14_TEST8"}, {"test/cutstock/type14_TEST9"}, {"test/cutstock/type14_TEST10"},
            {"test/cutstock/type15_TEST1"}, {"test/cutstock/type15_TEST2"}, {"test/cutstock/type15_TEST3"}, {"test/cutstock/type15_TEST4"},
            {"test/cutstock/type15_TEST5"}, {"test/cutstock/type15_TEST6"}, {"test/cutstock/type15_TEST7"}, {"test/cutstock/type15_TEST8"},
            {"test/cutstock/type15_TEST9"}, {"test/cutstock/type15_TEST10"}, {"test/cutstock/type16_TEST1"}, {"test/cutstock/type16_TEST2"},
            {"test/cutstock/type16_TEST3"}, {"test/cutstock/type16_TEST4"}, {"test/cutstock/type16_TEST5"}, {"test/cutstock/type16_TEST6"},
            {"test/cutstock/type16_TEST7"}, {"test/cutstock/type16_TEST8"},



            //table_example
            //%% Out of memory error; consider option -Xmx... for JVM
            //{"test/table_example/table_example"},



            //toy_problem
            //%% Stack overflow exception error; consider option -Xss... for JVM
            //{"test/toy_problem/toy_problem"},



            //evilshop
            {"test/evilshop/js-brs2-5"}, {"test/evilshop/js-brs2-6"}, {"test/evilshop/js-brs2-7"}, {"test/evilshop/js-ges1-4"},
            {"test/evilshop/js-ges1-5"}, {"test/evilshop/js-setf1-7"}, {"test/evilshop/js-setf1-8"}, {"test/evilshop/js-setf1-10"},
            {"test/evilshop/js-setf3-7"}, {"test/evilshop/js-setf3-8"}, {"test/evilshop/js-setf3-10"}, {"test/evilshop/js-setg2-5"},
            {"test/evilshop/js-setg2-6"}, {"test/evilshop/js-setg2-7"}, {"test/evilshop/js-setg2-10"},



            //filters
            {"test/filters/ ewf_4_3"}, {"test/filters/ fir16_1_3"}, {"test/filters/ar_1_1"}, {"test/filters/ar_1_2"},
            {"test/filters/ar_1_3"}, {"test/filters/ar_2_3"}, {"test/filters/dct_1_1"}, {"test/filters/dct_1_2"}, {"test/filters/dct_2_2"},
            {"test/filters/dct_2_3"}, {"test/filters/dct_3_3"}, {"test/filters/dct_3_4"}, {"test/filters/dfq_1_1"},
            {"test/filters/ewf_1_1"}, {"test/filters/ewf_2_1"}, {"test/filters/ewf_2_2"}, {"test/filters/fir16_1_1"},
            {"test/filters/fir16_1_2"}, {"test/filters/fir16_1_3"}, {"test/filters/fir_1_1"}, {"test/filters/fir_1_2"},
            {"test/filters/fir_2_2"}, {"test/filters/fir_2_3"},

            //flexible-jobshop
            {"test/flexible-jobshop/easy01"}, {"test/flexible-jobshop/hard19"}, {"test/flexible-jobshop/med04"},
            {"test/flexible-jobshop/med10"},

            //ghoulomb
            {"test/ghoulomb/3-3-3"}, {"test/ghoulomb/3-4-5"}, {"test/ghoulomb/3-4-6"}, {"test/ghoulomb/4-9-10"}, {"test/ghoulomb/4-9-12"},
            {"test/ghoulomb/4-9-14"}, {"test/ghoulomb/3-7-16"}, {"test/ghoulomb/4-7-16"}, {"test/ghoulomb/3-8-16"},
            {"test/ghoulomb/4-8-16"}, {"test/ghoulomb/3-9-16"}, {"test/ghoulomb/4-9-16"}, {"test/ghoulomb/3-10-16"},
            {"test/ghoulomb/4-10-16"}, {"test/ghoulomb/4-9-18"}, {"test/ghoulomb/3-7-20"}, {"test/ghoulomb/4-7-20"},
            {"test/ghoulomb/3-8-20"}, {"test/ghoulomb/4-8-20"}, {"test/ghoulomb/3-9-20"}, {"test/ghoulomb/4-9-20"},
            {"test/ghoulomb/3-10-20"},

            //nonogram
            {"test/nonogram/non_awful_1"}, {"test/nonogram/non_awful_2"}, {"test/nonogram/non_awful_3"}, {"test/nonogram/non_awful_5"},
            {"test/nonogram/non_fast_1"}, {"test/nonogram/non_fast_2"}, {"test/nonogram/non_fast_3"}, {"test/nonogram/non_fast_4"},
            {"test/nonogram/non_fast_5"}, {"test/nonogram/non_fast_6"}, {"test/nonogram/non_fast_7"}, {"test/nonogram/non_fast_8"},
            {"test/nonogram/non_fast_9"}, {"test/nonogram/non_fast_10"}, {"test/nonogram/non_fast_11"}, {"test/nonogram/non_med_1"},
            {"test/nonogram/non_med_2"}, {"test/nonogram/non_med_3"}, {"test/nonogram/non_med_4"},



            //golomb
            {"test/golomb/03"}, {"test/golomb/04"}, {"test/golomb/05"}, {"test/golomb/06"}, {"test/golomb/07"}, {"test/golomb/08"},
            {"test/golomb/09"}, {"test/golomb/10"}, {"test/golomb/11"}, {"test/golomb/12"},

            //java-routing
            {"test/java-routing/trip_6_3"}, {"test/java-routing/trip_7_1"}, {"test/java-routing/trip_7_2"}, {"test/java-routing/trip_8_1"},
            {"test/java-routing/trip_8_5"},

            //kakuro
            {"test/kakuro/kakuro_6_6_easy"}, {"test/kakuro/kakuro_6_6_hard"}, {"test/kakuro/kakuro_8_8_easy"},
            {"test/kakuro/kakuro_8_8_hard"}, {"test/kakuro/kakuro_8_8_super"},

            //rcpsp-max
            {"test/rcpsp-max/psp_d_244"}, {"test/rcpsp-max/psp_j10_33"}, {"test/rcpsp-max/psp_d_301"}, {"test/rcpsp-max/psp_ubo100_22"},
            {"test/rcpsp-max/psp_j30_244"}, {"test/rcpsp-max/psp_j30_169"}, {"test/rcpsp-max/psp_j20_34"}, {"test/rcpsp-max/psp_d_335"},
            {"test/rcpsp-max/psp_c_362"}, {"test/rcpsp-max/psp_c_51"}, {"test/rcpsp-max/psp_j30_168"}, {"test/rcpsp-max/psp_j20_35"},
            {"test/rcpsp-max/psp_c_314"}, {"test/rcpsp-max/psp_j30_123"}, {"test/rcpsp-max/psp_j30_33"}, {"test/rcpsp-max/psp_d_13"},
            {"test/rcpsp-max/psp_ubo200_57"}, {"test/rcpsp-max/psp_ubo200_80"},

            //latin-squares-fd

            {"test/latin-squares-fd/03"}, {"test/latin-squares-fd/07"}, {"test/latin-squares-fd/10"}, {"test/latin-squares-fd/12"},
            {"test/latin-squares-fd/15"}, {"test/latin-squares-fd/20"}, {"test/latin-squares-fd/25"},

            //latin-squares-fd2
            {"test/latin-squares-fd2/03"}, {"test/latin-squares-fd2/07"}, {"test/latin-squares-fd2/10"}, {"test/latin-squares-fd2/12"},
            {"test/latin-squares-fd2/15"}, {"test/latin-squares-fd2/20"}, {"test/latin-squares-fd2/25"},

            //latin-squares-lp
            {"test/latin-squares-lp/03"}, {"test/latin-squares-lp/07"}, {"test/latin-squares-lp/10"}, {"test/latin-squares-lp/12"},
            {"test/latin-squares-lp/15"}, {"test/latin-squares-lp/20"}, {"test/latin-squares-lp/25"},

            //league
            {"test/league/model10-3-4"}, {"test/league/model15-4-3"}, {"test/league/model20-3-5"}, {"test/league/model25-6-5"},
            {"test/league/model30-4-6"}, {"test/league/model35-6-10"}, {"test/league/model40-5-12"}, {"test/league/model45-7-8"},
            {"test/league/model50-4-4"}, {"test/league/model55-3-12"}, {"test/league/model60-5-11"}, {"test/league/model65-13-16"},
            {"test/league/model70-16-3"}, {"test/league/model75-7-7"}, {"test/league/model80-18-8"}, {"test/league/model85-7-16"},
            {"test/league/model90-18-20"}, {"test/league/model95-12-18"}, {"test/league/model100-21-12"},

            //linear-to-program
            {"test/linear-to-program/l2p1"}, {"test/linear-to-program/l2p2"}, {"test/linear-to-program/l2p12"},
            {"test/linear-to-program/l2p13"}, {"test/linear-to-program/l2p16"},

            //liner-sf-repositioning
            {"test/liner-sf-repositioning/fm3_5"}, {"test/liner-sf-repositioning/fm3_11"}, {"test/liner-sf-repositioning/tp7_0"},
            {"test/liner-sf-repositioning/tp7_8"}, {"test/liner-sf-repositioning/tp7_10"},

            //magicseq

            {"test/magicseq/005"}, {"test/magicseq/010"}, {"test/magicseq/020"}, {"test/magicseq/030"}, {"test/magicseq/040"},
            {"test/magicseq/050"}, {"test/magicseq/100"}, {"test/magicseq/300"}, {"test/magicseq/500"},


            //mario
            {"test/mario/mario_easy_2"}, {"test/mario/mario_easy_4"}, {"test/mario/mario_easy_5"}, {"test/mario/mario_n_medium_2"},
            {"test/mario/mario_n_medium_3"}, {"test/mario/mario_n_medium_4"}, {"test/mario/mario_n_medium_5"},
            {"test/mario/mario_t_hard_1"}, {"test/mario/mario_t_hard_2"}, {"test/mario/mario_t_hard_5"},

            //market_split
            {"test/market_split/s5-09"}, {"test/market_split/s5-10"}, {"test/market_split/u3-01"}, {"test/market_split/u3-02"},
            {"test/market_split/u3-03"}, {"test/market_split/u3-04"}, {"test/market_split/u3-05"}, {"test/market_split/u3-06"},
            {"test/market_split/u3-07"}, {"test/market_split/u3-08"}, {"test/market_split/u3-09"}, {"test/market_split/u3-10"},
            {"test/market_split/u4-01"}, {"test/market_split/u4-02"}, {"test/market_split/u4-03"}, {"test/market_split/u4-05"},
            {"test/market_split/u4-06"}, {"test/market_split/u4-07"}, {"test/market_split/u4-08"}, {"test/market_split/u4-09"},
            {"test/market_split/u4-10"}, {"test/market_split/u5-01"}, {"test/market_split/u5-02"}, {"test/market_split/u5-03"},
            {"test/market_split/u5-04"}, {"test/market_split/u5-05"}, {"test/market_split/u5-06"}, {"test/market_split/u5-07"},
            {"test/market_split/u5-08"}, {"test/market_split/u5-09"}, {"test/market_split/u5-10"},

            //mqueens2
            {"test/mqueens2/n11"}, {"test/mqueens2/n12"}, {"test/mqueens2/n13"}, {"test/mqueens2/n20"}, {"test/mqueens2/n31"},

            //mspsp
            {"test/mspsp/hard_02"}, {"test/mspsp/hard_03"}, {"test/mspsp/hard_04"}, {"test/mspsp/hard_05"}, {"test/mspsp/hard_06"},
            {"test/mspsp/hard_07"}, {"test/mspsp/hard_08"}, {"test/mspsp/medium_01"}, {"test/mspsp/medium_02"}, {"test/mspsp/medium_03"},
            {"test/mspsp/medium_04"}, {"test/mspsp/medium_05"}, {"test/mspsp/medium_06"}, {"test/mspsp/medium_07"},

            //stochastic-vrp
            {"test/stochastic-vrp/vrp-s2-v2-c7_vrp-v2-c7_det"}, {"test/stochastic-vrp/vrp-s3-v2-c6_vrp-v2-c6_det"},
            {"test/stochastic-vrp/vrp-s3-v2-c7_vrp-v2-c7_det"}, {"test/stochastic-vrp/vrp-s4-v2-c6_vrp-v2-c6_det"},

            //stochastic-fjsp
            {"test/stochastic-fjsp/fjsp-a1-s2_fjsp-t15-j3-m3-a1_det"}, {"test/stochastic-fjsp/fjsp-a1-s3_fjsp-t20-j4-m3-a1_det"},
            {"test/stochastic-fjsp/fjsp-a1-s4_fjsp-t8-j2-m3-a1_det"}, {"test/stochastic-fjsp/fjsp-a1-s5_fjsp-t8-j2-m3-a1_det"},
            {"test/stochastic-fjsp/fjsp-a1-s6_fjsp-t8-j2-m3-a1_det"},

            //table-layout
            {"test/table-layout/1000-1439-line292"}, {"test/table-layout/en-760-310-line795"}, {"test/table-layout/en-1000-251-line273"},
            {"test/table-layout/en-1000-274-line403"}, {"test/table-layout/en-1000-1274-line521"},
            {"test/table-layout/en-1000-1286-line764"}, {"test/table-layout/en-1000-1303-line283"},
            {"test/table-layout/en-1000-1303-line1078"}, {"test/table-layout/en-1000-1407-line976"},
            {"test/table-layout/en-1000-1407-line1350"}, {"test/table-layout/en-1000-1407-line1986"},
            {"test/table-layout/en-1000-1479-line419"}, {"test/table-layout/en-1000-1479-line1099"},
            {"test/table-layout/en-1000-1615-line479"}, {"test/table-layout/en-1250-158-line1950"},
            {"test/table-layout/en-1250-1074-line298"}, {"test/table-layout/en-1250-1261-line126"},
            {"test/table-layout/en-1250-1283-line119"}, {"test/table-layout/en-1250-1303-line283"},
            {"test/table-layout/en-1250-1305-line158"}, {"test/table-layout/en-1250-1407-line976"},
            {"test/table-layout/en-1250-1407-line1350"}, {"test/table-layout/en-1250-1407-line1986"},
            {"test/table-layout/en-1250-1479-line419.dzn"}, {"test/table-layout/en-1250-1479-line1099"},
            {"test/table-layout/en-1250-1479-line1633"},

            //parity-learning
            {"test/parity-learning/44_22_5.1"}, {"test/parity-learning/44_22_5.2"}, {"test/parity-learning/44_22_5.3"},
            {"test/parity-learning/48_24_6.1"}, {"test/parity-learning/48_24_6.2"}, {"test/parity-learning/48_24_6.3"},
            {"test/parity-learning/52_26_6.1"}, {"test/parity-learning/52_26_6.2"}, {"test/parity-learning/52_26_6.3"},

            //pattern_set_mining_k1
            {"test/pattern_set_mining_k1/anneal"}, {"test/pattern_set_mining_k1/audiology"}, {"test/pattern_set_mining_k1/german-credit"},
            {"test/pattern_set_mining_k1/hepatitis"}, {"test/pattern_set_mining_k1/hypothyroid"}, {"test/pattern_set_mining_k1/ionosphere"},
            {"test/pattern_set_mining_k1/kr-vs-kp"}, {"test/pattern_set_mining_k1/mushroom"},
            {"test/pattern_set_mining_k1/pattern_set_mining_k1.mzn"}, {"test/pattern_set_mining_k1/segment"},
            {"test/pattern_set_mining_k1/sonar"}, {"test/pattern_set_mining_k1/splice-1"}, {"test/pattern_set_mining_k1/vehicle"},
            {"test/pattern_set_mining_k1/vowel"}, {"test/pattern_set_mining_k1/waveform-5000"}, {"test/pattern_set_mining_k1/yeast"},



            //CELAR6-SUB0
            {"test/celar/CELAR6-SUB0"}, {"test/celar/CELAR6-SUB4"}, {"test/celar/CELAR7-SUB4"}, {"test/celar/graph05"},
            {"test/celar/scen07"},

            //cryptanalysis
            {"test/cryptanalysis/kb128_n5_obj11"}, {"test/cryptanalysis/kb128_n5_obj14"}, {"test/cryptanalysis/kb128_n5_obj16"},
            {"test/cryptanalysis/kb128_n5_obj17"}, {"test/cryptanalysis/kb192_n7_obj10"},

            //depot-placement
            {"test/depot-placement/att48_6"}, {"test/depot-placement/rat99_5"}, {"test/depot-placement/rat99_6"},
            {"test/depot-placement/st70_5"}, {"test/depot-placement/ulysses22_5"},

            //diameterc-mst
            {"test/diameterc-mst/c_v20_a190_d5"}, {"test/diameterc-mst/c_v15_a105_d7"}, {"test/diameterc-mst/s_v20_a50_d4"},
            {"test/diameterc-mst/s_v20_a50_d5"}, {"test/diameterc-mst/s_v40_a100_d5"},

            //elitserien
            {"test/elitserien/handball3"}, {"test/elitserien/handball5"}, {"test/elitserien/handball7"}, {"test/elitserien/handball17"},
            {"test/elitserien/handball20"},



            //gbac
            //java.lang.AssertionError: Two variables have the same id counter0::{0..6} counter0::{0..6}
            // {"test/gbac/reduced_UD3-gbac"},
            //java.lang.AssertionError: Two variables have the same id counter0::{0..4} counter0::{0..8}
            //  {"test/gbac/reduced_UD6-gbac"},
            //java.lang.AssertionError: Two variables have the same id counter0::{0..5} counter0::{0..6}
            // {"test/gbac/reduced_UD10-gbac"},
            //%% Evaluation of model resulted in an overflow.
            // java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
            // {"test/gbac/UD3-gbac"},
            //%% Evaluation of model resulted in an overflow.
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
            //  {"test/gbac/UD5-gbac"},


            //gfd-schedule
            {"upTo30sec/gfd-schedule/n120f5d50m50k20"}, {"upTo5sec/gfd-schedule/n180f7d50m30k18"}, {"test/gfd-schedule/n25f5d20m10k3"},
            {"test/gfd-schedule/n35f5d20m10k3"}, {"test/gfd-schedule/n55f2d50m30k3"}, {"test/gfd-schedule/n60f7d50m30k10"},
            {"test/gfd-schedule/n180f7d50m30k18"},

            //mapping
            {"upTo5sec/mapping/full2x2"}, {"upTo30sec/mapping/mesh3x3_2"}, {"upTo5min/mapping/mesh2x2_mpeg"},
            {"upTo5sec/mapping/mesh2x2_1"}, {"upTo5min/mapping/mesh2x2_mp3"}, {"test/mapping/mesh3x3_mp3"}, {"test/mapping/mesh4x4_1"},
            {"test/mapping/ring_1"},

            //maximum-dag
            {"test/maximum-dag/25_01"}, {"test/maximum-dag/25_03"}, {"test/maximum-dag/25_04"}, {"test/maximum-dag/25_06"},
            {"test/maximum-dag/31_02"},



            //mrcpsp
            {"test/mrcpsp/j30_1_10"}, {"test/mrcpsp/j30_15_5"}, {"test/mrcpsp/j30_17_10"}, {"test/mrcpsp/j30_37_4"}, {"test/mrcpsp/mrcpsp"},

            //nfc
            {"upTo5sec/nfc/12_2_5"}, {"upTo5sec/nfc/12_2_10"}, {"upTo5sec/nfc/18_3_5"}, {"upTo5sec/nfc/18_3_10"},

            //java.lang.AssertionError: non-optimal arcs:
            //[n_22->n_23, flow=1/1  reduced=2, index=9, forward = true, companion = [offset = 91, xVar = X_INTRODUCED_22, wVar = _13}]]
            //{"test/nfc/24_4_10"},

            //oocsp_racks
            {"test/oocsp_racks/oocsp_racks_030_e6_cc"}, {"test/oocsp_racks/oocsp_racks_030_ea4_cc"},
            {"test/oocsp_racks/oocsp_racks_030_f7_cc"}, {"test/oocsp_racks/oocsp_racks_030_mii8"}, {"test/oocsp_racks/oocsp_racks_100_r1"},

            //prize-collecting
            //                {"upTo5min/prize-collecting/28-4-7-1"},
            //                {"upTo5min/prize-collecting/30-5-6-2"},
            //                {"upTo5min/prize-collecting/30-5-6-8"},
            //                {"upTo1hour/prize-collecting/32-4-8-2"},
            //                {"upTo1hour/prize-collecting/32-4-8-5"},

            //rcpsp-wet
            //                {"upTo10min/rcpsp-wet/j30_27_5-wet"},
            //                {"upTo5min/rcpsp-wet/j30_44_8-wet"},


            //solbat
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0 {"test/solbat/sb_13_13_5_1"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0 {"test/solbat/sb_13_13_5_5"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0 {"test/solbat/sb_15_15_6_0"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/solbat/sb_15_15_7_3"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0 {"test/solbat/sb_15_15_7_5"},

            //tpp
            //                 {"upTo1hour/tpp/tpp_4_5_20_1"},
            //                 {"upTo1hour/tpp/tpp_5_3_30_1"},
            //                 {"upTo1min/tpp/tpp_6_3_20_1"},
            //                 {"upTo5min/tpp/tpp_7_3_20_1"},
            //TestTimedOutException:{"test/tpp/tpp_7_3_30_1"},

            //zephyrus
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0 {"test/zephyrus/12__6__8__3"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0 {"test/zephyrus/12__8__6__3"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0 {"test/zephyrus/14__6__8__3"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0 {"test/zephyrus/14__8__6__3"},
            //TestTimedOutException: {"test/zephyrus/14__10__8__3"},

            //stable_roommates
            //IndexOutOfBoundsException {"test/stable_roommates/sm6"},
            //IndexOutOfBoundsException {"test/stable_roommates/sri6"},

            //stable_roommates_func
            //                {"upTo5sec/stable_roommates_func/sm6_func"},
            //                {"upTo30sec/stable_roommates_func/sri6_func"},

            //submultisetsum
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/submultisetsum/submultisetsum"},

            //restert
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/restart/restart"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/restart/restart2"},

            //restarta
            {"upTo5sec/restarta/restarta"},

            //slow_convergence
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/slow_convergence/0100"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/slow_convergence/0200"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/slow_convergence/0300"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/slow_convergence/0400"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/slow_convergence/0500"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/slow_convergence/0600"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/slow_convergence/0700"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/slow_convergence/0800"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/slow_convergence/0900"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/slow_convergence/1000"},

            //schur_numbers
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/schur_numbers/5-3"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/schur_numbers/7-3"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/schur_numbers/10-3"},

            //search_stress
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/search_stress/search_stress"},

            //proteindesign12
            //TestTimedOutException{"test/proteindesign12/1HZ5.12p.9aa.usingEref_self"},
            //java.lang.NegativeArraySizeException{"test/proteindesign12/1HZ5.12p.19aa.usingEref_self"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0 {"test/proteindesign12/1PGB.11p.9aa.usingEref_self"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0 {"test/proteindesign12/1UBI.13p.9aa.usingEref_self"},

            //search_stress2
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/search_stress2/search_stress2"},

            //still-life-wastage
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/still-life-wastage/09"},

            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0 {"test/still-life-wastage/11"},
            //TestTimedOutException{"test/still-life-wastage/12"},
            //{"test/still-life-wastage/13"},

            //wwtpp-random
            //%% Stack overflow exception error; consider option -Xss... for JVM{"test/wwtpp-random/ex08000_2600_100"},
            //%% Stack overflow exception error; consider option -Xss... for JVM{"test/wwtpp-random/ex09900_2600_100"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/wwtpp-random/ex05000_2600_100"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/wwtpp-random/ex05100_2600_100"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/wwtpp-random/ex05200_2600_100"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/wwtpp-random/ex05300_2600_100"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/wwtpp-random/ex05400_2600_100"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/wwtpp-random/ex05500_2600_100"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/wwtpp-random/ex05600_2600_100"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/wwtpp-random/ex05700_2600_100"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/wwtpp-random/ex05800_2600_100"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/wwtpp-random/ex05900_2600_100"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0 {"test/wwtpp-random/ex06000_2600_100"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/wwtpp-random/ex06100_2600_100"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/wwtpp-random/ex06200_2600_100"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/wwtpp-random/ex06300_2600_100"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/wwtpp-random/ex06400_2600_100"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/wwtpp-random/ex06500_2600_100"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/wwtpp-random/ex06600_2600_100"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/wwtpp-random/ex06700_2600_100"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/wwtpp-random/ex06800_2600_100"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/wwtpp-random/ex06900_2600_100"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/wwtpp-random/ex07000_2600_100"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/wwtpp-random/ex07100_2600_100"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/wwtpp-random/ex07200_2600_100"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/wwtpp-random/ex07300_2600_100"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/wwtpp-random/ex07400_2600_100"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/wwtpp-random/ex07500_2600_100"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/wwtpp-random/ex07600_2600_100"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/wwtpp-random/ex07700_2600_100"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/wwtpp-random/ex07800_2600_100"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/wwtpp-random/ex07900_2600_100"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/wwtpp-random/ex08000_2600_100"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/wwtpp-random/ex08100_2600_100"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/wwtpp-random/ex08200_2600_100"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/wwtpp-random/ex08300_2600_100"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/wwtpp-random/ex08400_2600_100"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/wwtpp-random/ex08500_2600_100"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/wwtpp-random/ex08600_2600_100"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/wwtpp-random/ex08700_2600_100"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/wwtpp-random/ex08800_2600_100"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/wwtpp-random/ex08900_2600_100"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/wwtpp-random/ex09000_2600_100"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/wwtpp-random/ex09100_2600_100"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/wwtpp-random/ex09200_2600_100"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/wwtpp-random/ex09300_2600_100"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0 {"test/wwtpp-random/ex09400_2600_100"},
            //%% Stack overflow exception error; consider option -Xss... for JVM{"test/wwtpp-random/ex09500_2600_100"},
            //%% Stack overflow exception error; consider option -Xss... for JVM{"test/wwtpp-random/ex09600_2600_100"},
            //%% Stack overflow exception error; consider option -Xss... for JVM{"test/wwtpp-random/ex09700_2600_100"},
            //%% Stack overflow exception error; consider option -Xss... for JVM{"test/wwtpp-random/ex09800_2600_100"},
            //%% Stack overflow exception error; consider option -Xss... for JVM{"test/wwtpp-random/ex09900_2600_100"},
            //%% Stack overflow exception error; consider option -Xss... for JVM{"test/wwtpp-random/ex10000_2600_100"},
            //%% Stack overflow exception error; consider option -Xss... for JVM{"test/wwtpp-random/ex10800_2600_100"},
            ////%% Stack overflow exception error; consider option -Xss... for JVM{"test/wwtpp-random/ex10900_2600_100"},
            ////%% Stack overflow exception error; consider option -Xss... for JVM{"test/wwtpp-random/ex11000"},
            //% Stack overflow exception error; consider option -Xss... for JVM {"test/wwtpp-random/ex11000_2600_100"},
            //% Stack overflow exception error; consider option -Xss... for JVM{"test/wwtpp-random/ex11100_2600_100"},
            //%% Stack overflow exception error; consider option -Xss... for JVM{"test/wwtpp-random/ex12100_2600_100"},
            //%% Stack overflow exception error; consider option -Xss... for JVM{"test/wwtpp-random/ex12200_2600_100"},
            //%% Stack overflow exception error; consider option -Xss... for JVM{"test/wwtpp-random/ex12300_2600_100"},

            //wwtpp-real
            //TestTimedOutException {"test/wwtpp-real/ex02000_2400_100"},
            //TestTimedOutException {"test/wwtpp-real/ex02020_2400_100"},
            //TestTimedOutException{"test/wwtpp-real/ex02060_2400_100"},
            //TestTimedOutException{"test/wwtpp-real/ex02080_2400_100"},
            //TestTimedOutException{"test/wwtpp-real/ex02100_2400_100"},
            //TestTimedOutException{"test/wwtpp-real/ex02120_2400_100"},
            //TestTimedOutException{"test/wwtpp-real/ex02140_2400_100"},
            //TestTimedOutException{"test/wwtpp-real/ex02160_2400_100"},
            //TestTimedOutException{"test/wwtpp-real/ex02800_2400_100"},
            //TestTimedOutException{"test/wwtpp-real/ex02820_2400_100"},
            //TestTimedOutException{"test/wwtpp-real/ex02840_2400_100"},
            //TestTimedOutException{"test/wwtpp-real/ex02860_2400_100"},
            //TestTimedOutException{"test/wwtpp-real/ex02880_2400_100"},
            //TestTimedOutException{"test/wwtpp-real/ex02900_2400_100"},
            //TestTimedOutException{"test/wwtpp-real/ex02920_2400_100"},
            //%% Stack overflow exception error; consider option -Xss... for JVM{"test/wwtpp-real/ex02940_2400_100"},
            //%% Stack overflow exception error; consider option -Xss... for JVM{"test/wwtpp-real/ex02960_2400_100"},
            //%% Stack overflow exception error; consider option -Xss... for JVM{"test/wwtpp-real/ex03000_2400_100"},
            //                {"test/wwtpp-real/ex03020_2400_100"},
            //                {"test/wwtpp-real/ex03660_2400_100"},
            //                {"test/wwtpp-real/ex03680_2400_100"},
            //                {"test/wwtpp-real/ex03700_2400_100"},
            //                {"test/wwtpp-real/ex03720_2400_100"},
            //                {"test/wwtpp-real/ex03740_2400_100"},
            //                {"test/wwtpp-real/ex03760_2400_100"},
            //                {"test/wwtpp-real/ex03780_2400_100"},
            //                {"test/wwtpp-real/ex03800_2400_100"},
            //                {"test/wwtpp-real/ex03820_2400_100"},
            //                {"test/wwtpp-real/ex03840_2400_100"},
            //                {"test/wwtpp-real/ex03860_2400_100"},
            //                {"test/wwtpp-real/ex03880_2400_100"},
            //                {"test/wwtpp-real/ex03900_2400_100"},
            //                {"test/wwtpp-real/ex03920_2400_100"},
            //                {"test/wwtpp-real/ex03940_2400_100"},
            //                {"test/wwtpp-real/ex03960_2400_100"},
            //                {"test/wwtpp-real/ex03980_2400_100"},
            //                {"test/wwtpp-real/ex04000_2400_100"},
            //                {"test/wwtpp-real/ex04020_2400_100"},
            //                {"test/wwtpp-real/ex04040_2400_100"},
            //                {"test/wwtpp-real/ex04060_2400_100"},
            //                {"test/wwtpp-real/ex04080_2400_100"},
            //                {"test/wwtpp-real/ex04100_2400_100"},
            //                {"test/wwtpp-real/ex04120_2400_100"},
            //                {"test/wwtpp-real/ex04140_2400_100"},
            //                {"test/wwtpp-real/ex04160_2400_100"},
            //                {"test/wwtpp-real/ex04180_2400_100"},
            //                {"test/wwtpp-real/ex04200_2400_100"},
            //                {"test/wwtpp-real/ex04220_2400_100"},
            //                {"test/wwtpp-real/ex04240_2400_100"},
            //                {"test/wwtpp-real/ex04260_2400_100"},
            //                {"test/wwtpp-real/ex04280_2400_100"},
            //                {"test/wwtpp-real/ex04300_2400_100"},
            //                {"test/wwtpp-real/ex04320_2400_100"},
            //                {"test/wwtpp-real/ex04340_2400_100"},
            //                {"test/wwtpp-real/ex04360_2400_100"},
            //                {"test/wwtpp-real/ex04380_2400_100"},
            //                {"test/wwtpp-real/ex04400_2400_100"},
            //                {"test/wwtpp-real/ex04420_2400_100"},
            //                {"test/wwtpp-real/ex04440_2400_100"},
            //                {"test/wwtpp-real/ex04460_2400_100"},
            //                {"test/wwtpp-real/ex04480_2400_100"},
            //                {"test/wwtpp-real/ex04500_2400_100"},
            //                {"test/wwtpp-real/ex04520_2400_100"},
            //                {"test/wwtpp-real/ex04540_2400_100"},
            //                {"test/wwtpp-real/ex04560_2400_100"},
            //                {"test/wwtpp-real/ex04580_2400_100"},
            //                {"test/wwtpp-real/ex04600_2400_100"},
            //                {"test/wwtpp-real/ex04620_2400_100"},
            //                {"test/wwtpp-real/ex04640_2400_100"},
            //                {"test/wwtpp-real/ex04660_2400_100"},
            //                {"test/wwtpp-real/ex04680_2400_100"},
            //                {"test/wwtpp-real/ex04700_2400_100"},
            //                {"test/wwtpp-real/ex04720_2400_100"},
            //                {"test/wwtpp-real/ex04740_2400_100"},
            //                {"test/wwtpp-real/ex04760_2400_100"},
            //                {"test/wwtpp-real/ex04780_2400_100"},
            //                {"test/wwtpp-real/ex04800_2400_100"},
            //                {"test/wwtpp-real/ex04820_2400_100"},
            //                {"test/wwtpp-real/ex04840_2400_100"},
            //                {"test/wwtpp-real/ex04860_2400_100"},
            //                {"test/wwtpp-real/ex04880_2400_100"},
            //                {"test/wwtpp-real/ex04900_2400_100"},
            //                {"test/wwtpp-real/ex04920_2400_100"},
            //                {"test/wwtpp-real/ex04940_2400_100"},
            //                {"test/wwtpp-real/ex04960_2400_100"},
            //                {"test/wwtpp-real/ex04980_2400_100"},
            //                {"test/wwtpp-real/ex05000_2400_100"},
            //                {"test/wwtpp-real/ex05020_2400_100"},
            //                {"test/wwtpp-real/ex05040_2400_100"},
            //                {"test/wwtpp-real/ex05060_2400_100"},
            //                {"test/wwtpp-real/ex05080_2400_100"},
            //                {"test/wwtpp-real/ex05100_2400_100"},
            //                {"test/wwtpp-real/ex05120_2400_100"},
            //                {"test/wwtpp-real/ex05140_2400_100"},
            //                {"test/wwtpp-real/ex05160_2400_100"},
            //                {"test/wwtpp-real/ex05180_2400_100"},
            //                {"test/wwtpp-real/ex05200_2400_100"},
            //                {"test/wwtpp-real/ex05220_2400_100"},
            //                {"test/wwtpp-real/ex05240_2400_100"},
            //                {"test/wwtpp-real/ex05260_2400_100"},
            //                {"test/wwtpp-real/ex05280_2400_100"},
            //                {"test/wwtpp-real/ex05300_2400_100"},
            //                {"test/wwtpp-real/ex05320_2400_100"},
            //                {"test/wwtpp-real/ex05340_2400_100"},
            //                {"test/wwtpp-real/ex05360_2400_100"},
            //                {"test/wwtpp-real/ex05380_2400_100"},
            //                {"test/wwtpp-real/ex05400_2400_100"},
            //                {"test/wwtpp-real/ex05420_2400_100"},
            //                {"test/wwtpp-real/ex05440_2400_100"},
            //                {"test/wwtpp-real/ex05460_2400_100"},
            //                {"test/wwtpp-real/ex05480_2400_100"},
            //                {"test/wwtpp-real/ex05500_2400_100"},
            //                {"test/wwtpp-real/ex05520_2400_100"},
            //                {"test/wwtpp-real/ex05540_2400_100"},
            //                {"test/wwtpp-real/ex05560_2400_100"},
            //                {"test/wwtpp-real/ex05580_2400_100"},
            //                {"test/wwtpp-real/ex06000_2400_100"},
            //                {"test/wwtpp-real/ex06020_2400_100"},
            //                {"test/wwtpp-real/ex06040_2400_100"},
            //                {"test/wwtpp-real/ex06060_2400_100"},
            //                {"test/wwtpp-real/ex06080_2400_100"},
            //                {"test/wwtpp-real/ex06100_2400_100"},
            //                {"test/wwtpp-real/ex06120_2400_100"},
            //                {"test/wwtpp-real/ex06140_2400_100"},
            //                {"test/wwtpp-real/ex06160_2400_100"},
            //                {"test/wwtpp-real/ex06180_2400_100"},
            //                {"test/wwtpp-real/ex06200_2400_100"},
            //                {"test/wwtpp-real/ex06220_2400_100"},
            //                {"test/wwtpp-real/ex06240_2400_100"},
            //                {"test/wwtpp-real/ex06260_2400_100"},
            //                {"test/wwtpp-real/ex06280_2400_100"},
            //                {"test/wwtpp-real/ex06300_2400_100"},
            //                {"test/wwtpp-real/ex06320_2400_100"},
            //                {"test/wwtpp-real/ex06340_2400_100"},
            //                {"test/wwtpp-real/ex06360_2400_100"},
            //                {"test/wwtpp-real/ex06380_2400_100"},
            //                {"test/wwtpp-real/ex06400_2400_100"},
            //                {"test/wwtpp-real/ex06420_2400_100"},
            //                {"test/wwtpp-real/ex06440_2400_100"},
            //                {"test/wwtpp-real/ex06460_2400_100"},
            //                {"test/wwtpp-real/ex06480_2400_100"},
            //                {"test/wwtpp-real/ex06500_2400_100"},
            //                {"test/wwtpp-real/ex06520_2400_100"},
            //                {"test/wwtpp-real/ex06540_2400_100"},
            //                {"test/wwtpp-real/ex06560_2400_100"},
            //                {"test/wwtpp-real/ex06580_2400_100"},
            //                {"test/wwtpp-real/ex06600_2400_100"},
            //                {"test/wwtpp-real/ex06620_2400_100"},
            //                {"test/wwtpp-real/ex06640_2400_100"},
            //                {"test/wwtpp-real/ex06660_2400_100"},
            //                {"test/wwtpp-real/ex06680_2400_100"},
            //                {"test/wwtpp-real/ex06700_2400_100"},
            //                {"test/wwtpp-real/ex06720_2400_100"},
            //                {"test/wwtpp-real/ex06740_2400_100"},
            //                {"test/wwtpp-real/ex06760_2400_100"},
            //                {"test/wwtpp-real/ex06780_2400_100"},
            //                {"test/wwtpp-real/ex06800_2400_100"},
            //                {"test/wwtpp-real/ex06820_2400_100"},
            //                {"test/wwtpp-real/ex06840_2400_100"},
            //                {"test/wwtpp-real/ex06860_2400_100"},
            //                {"test/wwtpp-real/ex06880_2400_100"},
            //                {"test/wwtpp-real/ex06900_2400_100"},
            //                {"test/wwtpp-real/ex06920_2400_100"},
            //                {"test/wwtpp-real/ex06940_2400_100"},
            //                {"test/wwtpp-real/ex06960_2400_100"},
            //                {"test/wwtpp-real/ex06980_2400_100"},
            //                {"test/wwtpp-real/ex07000_2400_100"},
            //                {"test/wwtpp-real/ex07020_2400_100"},
            //                {"test/wwtpp-real/ex07060_2400_100"},
            //                {"test/wwtpp-real/ex07080_2400_100"},
            //                {"test/wwtpp-real/ex07100_2400_100"},
            //                {"test/wwtpp-real/ex07120_2400_100"},
            //                {"test/wwtpp-real/ex07140_2400_100"},
            //                {"test/wwtpp-real/ex07160_2400_100"},
            //                {"test/wwtpp-real/ex07180_2400_100"},
            //                {"test/wwtpp-real/ex07200_2400_100"},
            //                {"test/wwtpp-real/ex07220_2400_100"},
            //                {"test/wwtpp-real/ex07240_2400_100"},
            //                {"test/wwtpp-real/ex07260_2400_100"},
            //                {"test/wwtpp-real/ex07280_2400_100"},
            //                {"test/wwtpp-real/ex07300_2400_100"},
            //                {"test/wwtpp-real/ex07320_2400_100"},
            //                {"test/wwtpp-real/ex07340_2400_100"},
            //                {"test/wwtpp-real/ex07360_2400_100"},
            //                {"test/wwtpp-real/ex07380_2400_100"},
            //                {"test/wwtpp-real/ex07400_2400_100"},
            //                {"test/wwtpp-real/ex07420_2400_100"},
            //                {"test/wwtpp-real/ex07440_2400_100"},
            //                {"test/wwtpp-real/ex07460_2400_100"},
            //                {"test/wwtpp-real/ex07480_2400_100"},
            //                {"test/wwtpp-real/ex07500_2400_100"},
            //                {"test/wwtpp-real/ex07520_2400_100"},
            //                {"test/wwtpp-real/ex07540_2400_100"},
            //                {"test/wwtpp-real/ex07560_2400_100"},
            //                {"test/wwtpp-real/ex07580_2400_100"},
            //                {"test/wwtpp-real/ex07600_2400_100"},
            //                {"test/wwtpp-real/ex07620_2400_100"},
            //                {"test/wwtpp-real/ex07640_2400_100"},
            //                {"test/wwtpp-real/ex07660_2400_100"},
            //                {"test/wwtpp-real/ex07680_2400_100"},
            //                {"test/wwtpp-real/ex07700_2400_100"},
            //                {"test/wwtpp-real/ex07720_2400_100"},
            //                {"test/wwtpp-real/ex07740_2400_100"},
            //                {"test/wwtpp-real/ex07760_2400_100"},
            //                {"test/wwtpp-real/ex07780_2400_100"},
            //                {"test/wwtpp-real/ex07820_2400_100"},
            //                {"test/wwtpp-real/ex07840_2400_100"},
            //                {"test/wwtpp-real/ex07860_2400_100"},
            //                {"test/wwtpp-real/ex07880_2400_100"},
            //                {"test/wwtpp-real/ex07900_2400_100"},
            //                {"test/wwtpp-real/ex07920_2400_100"},
            //                {"test/wwtpp-real/ex07940_2400_100"},
            //                {"test/wwtpp-real/ex07960_2400_100"},
            //                {"test/wwtpp-real/ex07980_2400_100"},
            //                {"test/wwtpp-real/ex08000_2400_100"},
            //                {"test/wwtpp-real/ex08020_2400_100"},
            //                {"test/wwtpp-real/ex08040_2400_100"},
            //                {"test/wwtpp-real/ex08060_2400_100"},
            //                {"test/wwtpp-real/ex08080_2400_100"},
            //                {"test/wwtpp-real/ex08100_2400_100"},
            //                {"test/wwtpp-real/ex08120_2400_100"},
            //                {"test/wwtpp-real/ex08140_2400_100"},
            //                {"test/wwtpp-real/ex08160_2400_100"},
            //                {"test/wwtpp-real/ex08180_2400_100"},
            //                {"test/wwtpp-real/ex08200_2400_100"},
            //                {"test/wwtpp-real/ex08220_2400_100"},
            //                {"test/wwtpp-real/ex08240_2400_100"},
            //                {"test/wwtpp-real/ex08260_2400_100"},
            //                {"test/wwtpp-real/ex08280_2400_100"},
            //                {"test/wwtpp-real/ex08300_2400_100"},
            //                {"test/wwtpp-real/ex08320_2400_100"},
            //                {"test/wwtpp-real/ex08340_2400_100"},
            //                {"test/wwtpp-real/ex08360_2400_100"},
            //                {"test/wwtpp-real/ex08380_2400_100"},
            //                {"test/wwtpp-real/ex08400_2400_100"},
            //                {"test/wwtpp-real/ex08420_2400_100"},
            //                {"test/wwtpp-real/ex08440_2400_100"},
            //                {"test/wwtpp-real/ex08460_2400_100"},
            //                {"test/wwtpp-real/ex08480_2400_100"},
            //                {"test/wwtpp-real/ex08500_2400_100"},
            //                {"test/wwtpp-real/ex08520_2400_100"},
            //                {"test/wwtpp-real/ex08540_2400_100"},
            //                {"test/wwtpp-real/ex08560_2400_100"},
            //                {"test/wwtpp-real/ex08580_2400_100"},
            //                {"test/wwtpp-real/ex08600_2400_100"},
            //                {"test/wwtpp-real/ex08620_2400_100"},
            //                {"test/wwtpp-real/ex08640_2400_100"},
            //                {"test/wwtpp-real/ex08660_2400_100"},
            //                {"test/wwtpp-real/ex08680_2400_100"},
            //                {"test/wwtpp-real/ex08700_2400_100"},
            //                {"test/wwtpp-real/ex08720_2400_100"},
            //                {"test/wwtpp-real/ex08740_2400_100"},
            //                {"test/wwtpp-real/ex08760_2400_100"},
            //                {"test/wwtpp-real/ex08800_2400_100"},
            //                {"test/wwtpp-real/ex08820_2400_100"},
            //                {"test/wwtpp-real/ex08840_2400_100"},
            //                {"test/wwtpp-real/ex08860_2400_100"},
            //                {"test/wwtpp-real/ex08880_2400_100"},
            //                {"test/wwtpp-real/ex08900_2400_100"},
            //                {"test/wwtpp-real/ex08920_2400_100"},
            //                {"test/wwtpp-real/ex08940_2400_100"},
            //                {"test/wwtpp-real/ex08960_2400_100"},
            //                {"test/wwtpp-real/ex08980_2400_100"},
            //                {"test/wwtpp-real/ex09000_2400_100"},
            //                {"test/wwtpp-real/ex09020_2400_100"},
            //                {"test/wwtpp-real/ex09040_2400_100"},
            //                {"test/wwtpp-real/ex09060_2400_100"},
            //                {"test/wwtpp-real/ex09080_2400_100"},
            //                {"test/wwtpp-real/ex09100_2400_100"},
            //                {"test/wwtpp-real/ex09120_2400_100"},
            //                {"test/wwtpp-real/ex09140_2400_100"},
            //                {"test/wwtpp-real/ex09160_2400_100"},
            //                {"test/wwtpp-real/ex09180_2400_100"},
            //                {"test/wwtpp-real/ex09200_2400_100"},
            //                {"test/wwtpp-real/ex09220_2400_100"},
            //                {"test/wwtpp-real/ex09240_2400_100"},
            //                {"test/wwtpp-real/ex09260_2400_100"},
            //                {"test/wwtpp-real/ex09280_2400_100"},
            //                {"test/wwtpp-real/ex09300_2400_100"},
            //                {"test/wwtpp-real/ex09320_2400_100"},
            //                {"test/wwtpp-real/ex09340_2400_100"},
            //                {"test/wwtpp-real/ex09360_2400_100"},
            //                {"test/wwtpp-real/ex09380_2400_100"},
            //                {"test/wwtpp-real/ex09400_2400_100"},
            //                {"test/wwtpp-real/ex09420_2400_100"},
            //                {"test/wwtpp-real/ex09440_2400_100"},
            //                {"test/wwtpp-real/ex09460_2400_100"},
            //                {"test/wwtpp-real/ex09500_2400_100"},
            //                {"test/wwtpp-real/ex09520_2400_100"},
            //                {"test/wwtpp-real/ex09540_2400_100"},
            //                {"test/wwtpp-real/ex09560_2400_100"},
            //                {"test/wwtpp-real/ex09580_2400_100"},
            //                {"test/wwtpp-real/ex09600_2400_100"},
            //                {"test/wwtpp-real/ex09620_2400_100"},
            //                {"test/wwtpp-real/ex09640_2400_100"},
            //                {"test/wwtpp-real/ex09660_2400_100"},
            //                {"test/wwtpp-real/ex09680_2400_100"},
            //                {"test/wwtpp-real/ex09700_2400_100"},
            //                {"test/wwtpp-real/ex09720_2400_100"},
            //                {"test/wwtpp-real/ex09740_2400_100"},
            //                {"test/wwtpp-real/ex09760_2400_100"},
            //                {"test/wwtpp-real/ex09780_2400_100"},
            //                {"test/wwtpp-real/ex09800_2400_100"},
            //                {"test/wwtpp-real/ex09820_2400_100"},
            //                {"test/wwtpp-real/ex09840_2400_100"},
            //                {"test/wwtpp-real/ex09860_2400_100"},
            //                {"test/wwtpp-real/ex09880_2400_100"},
            //                {"test/wwtpp-real/ex09900_2400_100"},
            //                {"test/wwtpp-real/ex09920_2400_100"},
            //                {"test/wwtpp-real/ex09940_2400_100"},
            //                {"test/wwtpp-real/ex09960_2400_100"},
            //                {"test/wwtpp-real/ex09980_2400_100"},
            //                {"test/wwtpp-real/ex10000_2400_100"},

            //traveling-tppv



            //trucking
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
            //{"test/trucking/01"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/trucking/02"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0 {"test/trucking/03"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0 {"test/trucking/04"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0 {"test/trucking/05"},



            //shortest_path
            {"upTo5sec/shortest_path/00"}, {"upTo5sec/shortest_path/01"}, {"upTo5sec/shortest_path/02"},
            //org.junit.runners.model.TestTimedOutException{"test/shortest_path/03"},
            //org.junit.runners.model.TestTimedOutException{"test/shortest_path/04"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/shortest_path/05"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/shortest_path/06"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/shortest_path/07"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/shortest_path/08"},


            //talent_scheduling
            //Warning: Not implemented indomain method "indomain"; used indomain_min
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/talent_scheduling/concert"},
            //Warning: Not implemented indomain method "indomain"; used indomain_min
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/talent_scheduling/film103"},
            //Warning: Not implemented indomain method "indomain"; used indomain_min
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/talent_scheduling/film105"},
            //Warning: Not implemented indomain method "indomain"; used indomain_min
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/talent_scheduling/film114"},
            //Warning: Not implemented indomain method "indomain"; used indomain_min{"test/talent_scheduling/film116"},
            //Warning: Not implemented indomain method "indomain"; used indomain_min{"test/talent_scheduling/film117"},
            //Warning: Not implemented indomain method "indomain"; used indomain_min{"test/talent_scheduling/film118"},
            //Warning: Not implemented indomain method "indomain"; used indomain_min{"test/talent_scheduling/film119"},
            //Warning: Not implemented indomain method "indomain"; used indomain_min{"test/talent_scheduling/MobStory"},
            //Warning: Not implemented indomain method "indomain"; used indomain_min{"test/talent_scheduling/small"},
            //Warning: Not implemented indomain method "indomain"; used indomain_min{"test/talent_scheduling/tiny"},

            //template_design
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/template_design/catfood_2"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/template_design/catfood_3"},

            //tents
            {"upTo5sec/tents/tents_1"}, {"upTo5sec/tents/tents_2"}, {"upTo5sec/tents/tents_3"},

            //sugiyama
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/sugiyama2/g3_7_7_7"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/sugiyama2/g4_7_7_7_3"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/sugiyama2/g4_7_7_7_7"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/sugiyama2/g5_7_7_7_7_2"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/sugiyama2/g5_7_7_7_7_3"},

            //sugiyama2-mznchallenge2010
            //                {"upTo5sec/sugiyama2-mznchallenge2010/g3_7_7_7"},
            //                {"upTo5sec/sugiyama2-mznchallenge2010/g4_7_7_7_3"},
            //                {"upTo5sec/sugiyama2-mznchallenge2010/g4_7_7_7_7"},
            //                {"upTo5sec/sugiyama2-mznchallenge2010/g5_7_7_7_7_2"},
            //                {"upTo5sec/sugiyama2-mznchallenge2010/g5_7_7_7_7_3"},

            //train

            //                {"test/train/instance.5"},
            //                {"test/train/instance.6"},
            //                {"test/train/instance.7"},
            //                {"test/train/instance.8"},
            //                {"test/train/instance.9"},
            //                {"test/train/instance.10"},
            //                {"test/train/instance.11"},
            //                {"test/train/instance.12"},
            //                {"test/train/instance.13"},
            //                {"test/train/instance.14"},
            //                {"test/train/instance.15"},

            //steiner-triples
            {"upTo5sec/steiner-triples/03"}, {"upTo5sec/steiner-triples/07"},
            //{"upTo10min/steiner-triples/09"},


            //trucking_hl

            //Warning: Not implemented indomain method "indomain"; used indomain_min{"test/trucking_hl/trucking_hl_3"},
            //Warning: Not implemented indomain method "indomain"; used indomain_min{"test/trucking_hl/trucking_hl_4"},
            //Warning: Not implemented indomain method "indomain"; used indomain_min{"test/trucking_hl/trucking_hl_5"},

            //vrp
            //                {"fz/test/vrp/A-n32-k5.vrp"},
            //                {"test/vrp/A-n33-k5.vrp"},
            //                {"test/vrp/A-n33-k6.vrp"},
            //                {"test/vrp/A-n34-k5.vrp"},
            //                {"test/vrp/A-n36-k5.vrp"},
            //                {"test/vrp/A-n37-k5.vrp"},
            //                {"test/vrp/A-n37-k6.vrp"},
            //                {"test/vrp/A-n38-k5.vrp"},
            //                {"test/vrp/A-n39-k5.vrp"},
            //                {"test/vrp/A-n39-k6.vrp"},
            //                {"test/vrp/A-n44-k7.vrp"},
            //                {"test/vrp/A-n45-k6.vrp"},
            //                {"test/vrp/A-n45-k7.vrp"},
            //                {"test/vrp/A-n46-k7.vrp"},
            //                {"test/vrp/A-n48-k7.vrp"},
            //                {"test/vrp/A-n53-k7.vrp"},
            //                {"test/vrp/A-n54-k7.vrp"},
            //                {"test/vrp/A-n55-k9.vrp"},
            //                {"test/vrp/A-n60-k9.vrp"},
            //                {"test/vrp/A-n61-k9.vrp"},
            //                {"test/vrp/A-n62-k8.vrp"},
            //                {"test/vrp/A-n63-k9.vrp"},
            //                {"test/vrp/A-n63-k10.vrp"},
            //                {"test/vrp/A-n64-k9.vrp"},
            //                {"test/vrp/A-n65-k9.vrp"},
            //                {"test/vrp/A-n69-k9.vrp"},
            //                {"test/vrp/A-n80-k10.vrp"},
            //                {"test/vrp/B-n31-k5.vrp"},
            //                {"test/vrp/B-n34-k5.vrp"},
            //                {"test/vrp/B-n35-k5.vrp"},
            //                {"test/vrp/B-n38-k6.vrp"},
            //                {"test/vrp/B-n39-k5.vrp"},
            //                {"test/vrp/B-n41-k6.vrp"},
            //                {"test/vrp/B-n43-k6.vrp"},
            //                {"test/vrp/B-n44-k7.vrp"},
            //                {"test/vrp/B-n45-k5.vrp"},
            //                {"test/vrp/B-n45-k6.vrp"},
            //                {"test/vrp/B-n50-k7.vrp"},
            //                {"test/vrp/B-n50-k8.vrp"},
            //                {"test/vrp/B-n51-k7.vrp"},
            //                {"test/vrp/B-n52-k7.vrp"},
            //                {"test/vrp/B-n56-k7.vrp"},
            //                {"test/vrp/B-n57-k7.vrp"},
            //                {"test/vrp/B-n57-k9.vrp"},
            //                {"test/vrp/B-n63-k10.vrp"},
            //                {"test/vrp/B-n64-k9.vrp"},
            //                {"test/vrp/B-n66-k9.vrp"},
            //                {"test/vrp/B-n67-k10.vrp"},
            //                {"test/vrp/B-n68-k9.vrp"},
            //                {"test/vrp/B-n78-k10.vrp"},
            //                {"test/vrp/P-n16-k8.vrp"},
            //                {"test/vrp/P-n19-k2.vrp"},
            //                {"test/vrp/P-n20-k2.vrp"},
            //                {"test/vrp/P-n21-k2.vrp"},
            //                {"test/vrp/P-n22-k2.vrp"},
            //                {"test/vrp/P-n22-k8.vrp"},
            //                {"test/vrp/P-n23-k8.vrp"},
            //                {"test/vrp/P-n40-k5.vrp"},
            //                {"test/vrp/P-n45-k5.vrp"},
            //                {"test/vrp/P-n50-k7.vrp"},
            //                {"test/vrp/P-n50-k8.vrp"},
            //                {"test/vrp/P-n50-k10.vrp"},
            //                {"test/vrp/P-n51-k10.vrp"},
            //                {"test/vrp/P-n55-k7.vrp"},
            //                {"test/vrp/P-n55-k8.vrp"},
            //                {"test/vrp/P-n55-k10.vrp"},
            //                {"test/vrp/P-n55-k15.vrp"},
            //                {"test/vrp/P-n60-k10.vrp"},
            //                {"test/vrp/P-n60-k15.vrp"},
            //                {"test/vrp/P-n65-k10.vrp"},
            //                {"test/vrp/P-n70-k10.vrp"},
            //                {"test/vrp/P-n76-k4.vrp"},
            //                {"test/vrp/P-n76-k5.vrp"},
            //                {"test/vrp/P-n101-k4.vrp"},

            //road-cons
            //                {"test/road-cons/road_9"},
            //                {"test/road-cons/road_11"},
            //                {"test/road-cons/road_14"},
            //                {"test/road-cons/road_16"},
            //                {"test/road-cons/road_20"},

            //rubik
            //                {"test/rubik/4-cube"},
            //                {"test/rubik/5-cube"},
            //                {"test/rubik/6-cube"},
            //                {"test/rubik/7-cube"},
            //                {"test/rubik/8-cube"},


            //openshop
            //Warning: Not implemented indomain method "indomain"; used indomain_min{"test/openshop/gp10-4"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0 {"test/openshop/j7per10-1"},

            //prop_stress
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/prop_stress/0100"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/prop_stress/0200"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/prop_stress/0300"},
            //=====UNSATISFIABLE====={"test/prop_stress/0400"},
            //=====UNSATISFIABLE====={"test/prop_stress/0500"},


            //on-call-rostering
            //                 {"upTo5sec/on-call-rostering/4s-10d"},
            //                 {"upTo5min/on-call-rostering/4s-23d"},


            //pentominoes
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/pentominoes/01"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/pentominoes/02"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/pentominoes/03"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/pentominoes/04"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/pentominoes/05"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/pentominoes/06"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/pentominoes/07"},

            //ship-schedule.cp
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0                 {"test/ship-schedule.cp/3Ships"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0     {"test/ship-schedule.cp/3ShipsMixed"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/ship-schedule.cp/3ShipsMixedUnconst"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/ship-schedule.cp/3ShipsUnconst"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/ship-schedule.cp/4Ships"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/ship-schedule.cp/4ShipsMixed"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/ship-schedule.cp/4ShipsMixedUnconst"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/ship-schedule.cp/4ShipsUnconst"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/ship-schedule.cp/5Ships"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/ship-schedule.cp/5ShipsMixed"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/ship-schedule.cp/5ShipsMixedUnconst"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/ship-schedule.cp/5ShipsUnconst"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/ship-schedule.cp/6Ships"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/ship-schedule.cp/6ShipsMixed"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/ship-schedule.cp/6ShipsMixedUnconst"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/ship-schedule.cp/6ShipsUnconst"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/ship-schedule.cp/7Ships"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/ship-schedule.cp/7ShipsMixed"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/ship-schedule.cp/7ShipsMixedUnconst"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/ship-schedule.cp/7ShipsUnconst"},


            //{"upTo1hour/ship-schedule.cp/8ShipsUnconst"},

            //ship-schedule.mip
            {"upTo5sec/ship-schedule.mip/3Ships"},
            //                {"upTo5sec/ship-schedule.mip/3ShipsMixed"},
            //                {"upTo5sec/ship-schedule.mip/3ShipsMixedUnconst"},
            //                {"upTo5sec/ship-schedule.mip/3ShipsUnconst"},
            //                {"upTo5min/ship-schedule.mip/4Ships"},
            //                {"upTo5min/ship-schedule.mip/4ShipsMixed"},
            //                {"upTo5min/ship-schedule.mip/4ShipsMixedUnconst"},
            //                {"upTo5min/ship-schedule.mip/4ShipsUnconst"},

            //{"upTo1hour/ship-schedule.mip/5ShipsMixed"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/ship-schedule.mip/5ShipsMixedUnconst"},
            //{"above1hour/ship-schedule.mip/5ShipsUnconst"},

            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0 {"test/ship-schedule.mip/6ShipsMixed"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0 {"test/ship-schedule.mip/6ShipsMixedUnconst"},


            //still_life
            //                {"upTo5sec/still_life/2x3"},
            //                {"upTo5sec/still_life/2x4"},
            //                {"upTo5sec/still_life/3x3"},
            //                {"upTo5sec/still_life/3x8"},
            //                {"upTo5sec/still_life/4x4"},
            //                {"upTo5sec/still_life/5x5"},
            //                {"upTo5sec/still_life/6x6"},
            //                {"upTo5sec/still_life/7x7"},
            //                {"upTo5sec/still_life/8x8"},
            //                {"upTo1hour/still_life/9x9"},

            //still_life_free
            {"upTo5sec/still_life_free/2x3"}, {"upTo5sec/still_life_free/2x4"}, {"upTo5sec/still_life_free/3x3"},
            {"upTo5sec/still_life_free/3x8"}, {"upTo5sec/still_life_free/4x4"}, {"upTo5sec/still_life_free/5x5"},
            {"upTo5sec/still_life_free/6x6"}, {"upTo5min/still_life_free/7x7"},
            //{"above1hour/still_life_free/8x8"},


            //still_life_full_border
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/still_life_free/3x8"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/still_life_free/4x4"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/still_life_free/5x5"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/still_life_free/6x6"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/still_life_free/7x7"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/still_life_free/8x8"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/still_life_free/9x9"},

            //still_life_no_border
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/still_life_no_border/2x3"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/still_life_no_border/2x4"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/still_life_no_border/3x3"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/still_life_no_border/3x8"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/still_life_no_border/4x4"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/still_life_no_border/5x5"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/still_life_no_border/6x6"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/still_life_no_border/7x7"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/still_life_no_border/8x8"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/still_life_no_border/9x9"},

            //still_life2
            {"upTo5sec/still_life2/still_life_5"}, {"upTo5sec/still_life2/still_life_6"}, {"upTo5sec/still_life2/still_life_7"},
            {"upTo1hour/still_life2/still_life_9"},

            //smelt
            //{"upTo5sec/smelt/smelt_2"},
            //{"above1hour/smelt/smelt_4"},

            //rectangle-packing
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0 {"test/rectangle-packing/data_mznc2014/rpp18_true"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/rectangle-packing/data_mznc2014/rpp21_false"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/rectangle-packing/data_mznc2014/rpp22_false"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/rectangle-packing/data_square/rpp03_false"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/rectangle-packing/data_square/rpp03_true"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/rectangle-packing/data_square/rpp04_false"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/rectangle-packing/data_square/rpp04_true"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/rectangle-packing/data_square/rpp05_false"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/rectangle-packing/data_square/rpp05_true"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/rectangle-packing/data_square/rpp06_false"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/rectangle-packing/data_square/rpp06_true"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/rectangle-packing/data_square/rpp07_false"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/rectangle-packing/data_square/rpp07_true"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/rectangle-packing/data_square/rpp08_false"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/rectangle-packing/data_square/rpp08_true"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/rectangle-packing/data_square/rpp09_false"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/rectangle-packing/data_square/rpp09_true"},
            ///java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/rectangle-packing/data_square/rpp10_false"},
            ///java.lang.IndexOutOfBoundsException: Index: 0, Size: 0 {"test/rectangle-packing/data_square/rpp10_true"},
            ///java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/rectangle-packing/data_square/rpp11_false"},
            ///java.lang.IndexOutOfBoundsException: Index: 0, Size: 0 {"test/rectangle-packing/data_square/rpp11_true"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0 {"test/rectangle-packing/data_square/rpp12_false"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/rectangle-packing/data_square/rpp12_true"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/rectangle-packing/data_square/rpp13_false"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/rectangle-packing/data_square/rpp13_true"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0 {"test/rectangle-packing/data_square/rpp14_false"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0 {"test/rectangle-packing/data_square/rpp14_true"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0 {"test/rectangle-packing/data_square/rpp15_true"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0 {"test/rectangle-packing/data_square/rpp16_false"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/rectangle-packing/data_square/rpp16_true"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/rectangle-packing/data_square/rpp17_false"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/rectangle-packing/data_square/rpp17_true"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0 {"test/rectangle-packing/data_square/rpp18_false"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/rectangle-packing/data_square/rpp18_true"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/rectangle-packing/data_square/rpp19_false"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/rectangle-packing/data_square/rpp19_true"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/rectangle-packing/data_square/rpp20_false"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/rectangle-packing/data_square/rpp20_true"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/rectangle-packing/data_square/rpp21_false"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/rectangle-packing/data_square/rpp21_true"},

            //rectangle-packing-mznc2014

            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/rectangle-packing-mznc2014/data_square/rpp03_true"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/rectangle-packing-mznc2014/data_square/rpp04_false"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/rectangle-packing-mznc2014/data_square/rpp04_true"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/rectangle-packing-mznc2014/data_square/rpp05_false"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/rectangle-packing-mznc2014/data_square/rpp05_true"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/rectangle-packing-mznc2014/data_square/rpp06_false"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/rectangle-packing-mznc2014/data_square/rpp06_true"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/rectangle-packing-mznc2014/data_square/rpp07_false"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/rectangle-packing-mznc2014/data_square/rpp07_true"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/rectangle-packing-mznc2014/data_square/rpp08_false"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/rectangle-packing-mznc2014/data_square/rpp08_true"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/rectangle-packing-mznc2014/data_square/rpp09_false"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/rectangle-packing-mznc2014/data_square/rpp09_true"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/rectangle-packing-mznc2014/data_square/rpp10_false"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/rectangle-packing-mznc2014/data_square/rpp10_true"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/rectangle-packing-mznc2014/data_square/rpp11_false"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/rectangle-packing-mznc2014/data_square/rpp11_true"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/rectangle-packing-mznc2014/data_square/rpp12_false"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/rectangle-packing-mznc2014/data_square/rpp12_true"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/rectangle-packing-mznc2014/data_square/rpp13_false"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/rectangle-packing-mznc2014/data_square/rpp13_true"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/rectangle-packing-mznc2014/data_square/rpp14_false"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/rectangle-packing-mznc2014/data_square/rpp14_true"},
            {"test/rectangle-packing-mznc2014/data_square/rpp15_false"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/rectangle-packing-mznc2014/data_square/rpp15_true"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/rectangle-packing-mznc2014/data_square/rpp16_false"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/rectangle-packing-mznc2014/data_square/rpp16_true"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/rectangle-packing-mznc2014/data_square/rpp17_false"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/rectangle-packing-mznc2014/data_square/rpp17_true"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/rectangle-packing-mznc2014/data_square/rpp18_false"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/rectangle-packing-mznc2014/data_square/rpp18_true"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/rectangle-packing-mznc2014/data_square/rpp19_false"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/rectangle-packing-mznc2014/data_square/rpp19_true"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/rectangle-packing-mznc2014/data_square/rpp20_false"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/rectangle-packing-mznc2014/data_square/rpp20_true"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/rectangle-packing-mznc2014/data_square/rpp21_false"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/rectangle-packing-mznc2014/data_square/rpp21_true"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/rectangle-packing-mznc2014/data_square/rpp22_false"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/rectangle-packing-mznc2014/data_square/rpp22_true"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/rectangle-packing-mznc2014/data_square/rpp23_false"},

            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/rectangle-packing-mznc2014/data_square/rpp24_false"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/rectangle-packing-mznc2014/data_square/rpp24_true"},

            //                {"test/rectangle-packing-mznc2014/data_square/rpp29_false"},
            //                {"test/rectangle-packing-mznc2014/data_square/rpp29_true"},
            //                {"test/rectangle-packing-mznc2014/data_square/rpp30_false"},
            //                {"test/rectangle-packing-mznc2014/data_square/rpp30_true"},

            //rect_packing_opt
            //                {"test/rect_packing_opt/data_square/rpp03_false"},
            //                {"test/rect_packing_opt/data_square/rpp03_true"},
            //                {"test/rect_packing_opt/data_square/rpp04_false"},
            //                {"test/rect_packing_opt/data_square/rpp04_true"},
            //                {"test/rect_packing_opt/data_square/rpp05_false"},
            //                {"test/rect_packing_opt/data_square/rpp05_true"},
            //                {"test/rect_packing_opt/data_square/rpp06_false"},
            //                {"test/rect_packing_opt/data_square/rpp06_true"},
            //                {"test/rect_packing_opt/data_square/rpp07_false"},
            //                {"test/rect_packing_opt/data_square/rpp07_true"},
            //                {"test/rect_packing_opt/data_square/rpp08_false"},
            //                {"test/rect_packing_opt/data_square/rpp08_true"},
            //                {"test/rect_packing_opt/data_square/rpp09_false"},
            //                {"test/rect_packing_opt/data_square/rpp09_true"},
            //                {"test/rect_packing_opt/data_square/rpp10_false"},
            //                {"test/rect_packing_opt/data_square/rpp10_true"},
            //                {"test/rect_packing_opt/data_square/rpp11_false"},
            //                {"test/rect_packing_opt/data_square/rpp11_true"},
            //                {"test/rect_packing_opt/data_square/rpp12_false"},
            //                {"test/rect_packing_opt/data_square/rpp12_true"},
            //                {"test/rect_packing_opt/data_square/rpp13_false"},
            //                {"test/rect_packing_opt/data_square/rpp13_true"},
            //                {"test/rect_packing_opt/data_square/rpp14_false"},
            //                {"test/rect_packing_opt/data_square/rpp14_true"},
            //                {"test/rect_packing_opt/data_square/rpp15_false"},
            //                {"test/rect_packing_opt/data_square/rpp15_true"},
            //                {"test/rect_packing_opt/data_square/rpp16_false"},
            //                {"test/rect_packing_opt/data_square/rpp16_true"},
            //                {"test/rect_packing_opt/data_square/rpp17_false"},
            //                {"test/rect_packing_opt/data_square/rpp17_true"},
            //                {"test/rect_packing_opt/data_square/rpp18_false"},
            //                {"test/rect_packing_opt/data_square/rpp18_true"},
            //                {"test/rect_packing_opt/data_square/rpp19_false"},
            //                {"test/rect_packing_opt/data_square/rpp19_true"},
            //                {"test/rect_packing_opt/data_square/rpp20_false"},
            //                {"test/rect_packing_opt/data_square/rpp20_true"},
            //                {"test/rect_packing_opt/data_square/rpp21_false"},
            //                {"test/rect_packing_opt/data_square/rpp21_true"},
            //                {"test/rect_packing_opt/data_square/rpp22_false"},
            //                {"test/rect_packing_opt/data_square/rpp22_true"},
            //                {"test/rect_packing_opt/data_square/rpp23_false"},
            //                {"test/rect_packing_opt/data_square/rpp23_true"},
            //                {"test/rect_packing_opt/data_square/rpp24_false"},
            //                {"test/rect_packing_opt/data_square/rpp24_true"},
            //                {"test/rect_packing_opt/data_square/rpp25_false"},
            //                {"test/rect_packing_opt/data_square/rpp25_true"},
            //                {"test/rect_packing_opt/data_square/rpp26_false"},
            //                {"test/rect_packing_opt/data_square/rpp26_true"},
            //                {"test/rect_packing_opt/data_square/rpp27_false"},
            //                {"test/rect_packing_opt/data_square/rpp27_true"},
            //                {"test/rect_packing_opt/data_square/rpp28_true"},
            //                {"test/rect_packing_opt/data_square/rpp29_false"},
            //                {"test/rect_packing_opt/data_square/rpp29_true"},
            //                {"test/rect_packing_opt/data_square/rpp30_false"},
            //                {"test/rect_packing_opt/data_square/rpp30_true"},

            //queens
            {"upTo5sec/queens/004"}, {"upTo5sec/queens/008"}, {"upTo5sec/queens/020"},


            //rcpsp
            //{"upTo1hour/rcpsp/00"},

            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/rcpsp/02"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/rcpsp/03"},

            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/rcpsp/06"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/rcpsp/07"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/rcpsp/08"},

            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/rcpsp/data_at/st103_9"},
            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/rcpsp/data_at/st103_10"},

            //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0{"test/rcpsp/data_at/st103_32"},
            {"test/rcpsp/data_at/st103_35"}, {"test/rcpsp/data_at/st103_36"}, {"test/rcpsp/data_at/st103_37"},
            {"test/rcpsp/data_at/st103_38"}, {"test/rcpsp/data_at/st103_39"}, {"test/rcpsp/data_at/st103_40"},
            {"test/rcpsp/data_at/st103_41"}, {"test/rcpsp/data_at/st103_42"}, {"test/rcpsp/data_at/st103_43"},
            {"test/rcpsp/data_at/st103_44"}, {"test/rcpsp/data_at/st103_45"}, {"test/rcpsp/data_at/st103_46"},
            {"test/rcpsp/data_at/st103_47"}, {"test/rcpsp/data_at/st103_48"}, {"test/rcpsp/data_at/st27_1"}, {"test/rcpsp/data_at/st27_2"},
            {"test/rcpsp/data_at/st27_3"}, {"test/rcpsp/data_at/st27_4"}, {"test/rcpsp/data_at/st27_5"}, {"test/rcpsp/data_at/st27_6"},
            {"test/rcpsp/data_at/st27_7"}, {"test/rcpsp/data_at/st27_8"}, {"test/rcpsp/data_at/st27_9"}, {"test/rcpsp/data_at/st27_10"},
            {"test/rcpsp/data_at/st27_11"}, {"test/rcpsp/data_at/st27_12"}, {"test/rcpsp/data_at/st27_13"}, {"test/rcpsp/data_at/st27_14"},
            {"test/rcpsp/data_at/st27_15"}, {"test/rcpsp/data_at/st27_16"}, {"test/rcpsp/data_at/st27_17"}, {"test/rcpsp/data_at/st27_18"},
            {"test/rcpsp/data_at/st27_19"}, {"test/rcpsp/data_at/st27_20"}, {"test/rcpsp/data_at/st27_21"}, {"test/rcpsp/data_at/st27_22"},
            {"test/rcpsp/data_at/st27_23"}, {"test/rcpsp/data_at/st27_24"}, {"test/rcpsp/data_at/st27_25"}, {"test/rcpsp/data_at/st27_26"},
            {"test/rcpsp/data_at/st27_27"}, {"test/rcpsp/data_at/st27_28"}, {"test/rcpsp/data_at/st27_29"}, {"test/rcpsp/data_at/st27_30"},
            {"test/rcpsp/data_at/st27_31"}, {"test/rcpsp/data_at/st27_32"}, {"test/rcpsp/data_at/st27_33"}, {"test/rcpsp/data_at/st27_34"},
            {"test/rcpsp/data_at/st27_35"}, {"test/rcpsp/data_at/st27_36"}, {"test/rcpsp/data_at/st27_37"}, {"test/rcpsp/data_at/st27_38"},
            {"test/rcpsp/data_at/st27_39"}, {"test/rcpsp/data_at/st27_40"}, {"test/rcpsp/data_at/st27_41"}, {"test/rcpsp/data_at/st27_42"},
            {"test/rcpsp/data_at/st27_43"}, {"test/rcpsp/data_at/st27_44"}, {"test/rcpsp/data_at/st27_45"}, {"test/rcpsp/data_at/st27_46"},
            {"test/rcpsp/data_at/st27_47"}, {"test/rcpsp/data_at/st27_48"}, {"test/rcpsp/data_at/st51_1"}, {"test/rcpsp/data_at/st51_2"},
            {"test/rcpsp/data_at/st51_3"}, {"test/rcpsp/data_at/st51_4"}, {"test/rcpsp/data_at/st51_5"}, {"test/rcpsp/data_at/st51_6"},
            {"test/rcpsp/data_at/st51_7"}, {"test/rcpsp/data_at/st51_8"}, {"test/rcpsp/data_at/st51_9"}, {"test/rcpsp/data_at/st51_10"},
            {"test/rcpsp/data_at/st51_11"}, {"test/rcpsp/data_at/st51_12"}, {"test/rcpsp/data_at/st51_13"}, {"test/rcpsp/data_at/st51_14"},
            {"test/rcpsp/data_at/st51_15"}, {"test/rcpsp/data_at/st51_16"}, {"test/rcpsp/data_at/st51_17"}, {"test/rcpsp/data_at/st51_18"},
            {"test/rcpsp/data_at/st51_19"}, {"test/rcpsp/data_at/st51_20"}, {"test/rcpsp/data_at/st51_21"}, {"test/rcpsp/data_at/st51_22"},
            {"test/rcpsp/data_at/st51_23"}, {"test/rcpsp/data_at/st51_24"}, {"test/rcpsp/data_at/st51_25"}, {"test/rcpsp/data_at/st51_26"},
            {"test/rcpsp/data_at/st51_27"}, {"test/rcpsp/data_at/st51_28"}, {"test/rcpsp/data_at/st51_29"}, {"test/rcpsp/data_at/st51_30"},
            {"test/rcpsp/data_at/st51_31"}, {"test/rcpsp/data_at/st51_32"}, {"test/rcpsp/data_at/st51_33"}, {"test/rcpsp/data_at/st51_34"},
            {"test/rcpsp/data_at/st51_35"}, {"test/rcpsp/data_at/st51_36"}, {"test/rcpsp/data_at/st51_37"}, {"test/rcpsp/data_at/st51_38"},
            {"test/rcpsp/data_at/st51_39"}, {"test/rcpsp/data_at/st51_40"}, {"test/rcpsp/data_at/st51_41"}, {"test/rcpsp/data_at/st51_42"},
            {"test/rcpsp/data_at/st51_43"}, {"test/rcpsp/data_at/st51_44"}, {"test/rcpsp/data_at/st51_45"}, {"test/rcpsp/data_at/st51_46"},
            {"test/rcpsp/data_at/st51_47"}, {"test/rcpsp/data_at/st51_48"}, {"test/rcpsp/data_bl/Bl2001"}, {"test/rcpsp/data_bl/Bl2002"},
            {"test/rcpsp/data_bl/Bl2003"}, {"test/rcpsp/data_bl/Bl2004"}, {"test/rcpsp/data_bl/Bl2005"}, {"test/rcpsp/data_bl/Bl2006"},
            {"test/rcpsp/data_bl/Bl2007"}, {"test/rcpsp/data_bl/Bl2008"}, {"test/rcpsp/data_bl/Bl2009"}, {"test/rcpsp/data_bl/Bl2010"},
            {"test/rcpsp/data_bl/Bl2011"}, {"test/rcpsp/data_bl/Bl2012"}, {"test/rcpsp/data_bl/Bl2013"}, {"test/rcpsp/data_bl/Bl2014"},
            {"test/rcpsp/data_bl/Bl2015"}, {"test/rcpsp/data_bl/Bl2016"}, {"test/rcpsp/data_bl/Bl2017"}, {"test/rcpsp/data_bl/Bl2018"},
            {"test/rcpsp/data_bl/Bl2019"}, {"test/rcpsp/data_bl/Bl2020"}, {"test/rcpsp/data_bl/Bl2501"}, {"test/rcpsp/data_bl/Bl2502"},
            {"test/rcpsp/data_bl/Bl2504"}, {"test/rcpsp/data_bl/Bl2505"}, {"test/rcpsp/data_bl/Bl2506"}, {"test/rcpsp/data_bl/Bl2507"},
            {"test/rcpsp/data_bl/Bl2508"}, {"test/rcpsp/data_bl/Bl2509"}, {"test/rcpsp/data_bl/Bl2510"}, {"test/rcpsp/data_bl/Bl2511"},
            {"test/rcpsp/data_bl/Bl2512"}, {"test/rcpsp/data_bl/Bl2513"}, {"test/rcpsp/data_bl/Bl2514"}, {"test/rcpsp/data_bl/Bl2515"},
            {"test/rcpsp/data_bl/Bl2516"}, {"test/rcpsp/data_bl/Bl2517"}, {"test/rcpsp/data_bl/Bl2518"}, {"test/rcpsp/data_bl/Bl2519"},
            {"test/rcpsp/data_bl/Bl2520"}, {"test/rcpsp/data_ksd15_d/j3010_1"}, {"test/rcpsp/data_ksd15_d/j3010_2"},
            {"test/rcpsp/data_ksd15_d/j3010_3"}, {"test/rcpsp/data_ksd15_d/j3010_4"}, {"test/rcpsp/data_ksd15_d/j3010_5"},
            {"test/rcpsp/data_ksd15_d/j3010_6"}, {"test/rcpsp/data_ksd15_d/j3010_7"}, {"test/rcpsp/data_ksd15_d/j3010_8"},
            {"test/rcpsp/data_ksd15_d/j3010_9"}, {"test/rcpsp/data_ksd15_d/j3010_10"}, {"test/rcpsp/data_ksd15_d/j3011_1"},
            {"test/rcpsp/data_ksd15_d/j3011_2"}, {"test/rcpsp/data_ksd15_d/j3011_3"}, {"test/rcpsp/data_ksd15_d/j3011_4"},
            {"test/rcpsp/data_ksd15_d/j3011_5"}, {"test/rcpsp/data_ksd15_d/j3011_6"}, {"test/rcpsp/data_ksd15_d/j3011_7"},
            {"test/rcpsp/data_ksd15_d/j3011_8"}, {"test/rcpsp/data_ksd15_d/j3011_9"}, {"test/rcpsp/data_ksd15_d/j3011_10"},
            {"test/rcpsp/data_ksd15_d/j3012_1"}, {"test/rcpsp/data_ksd15_d/j3012_2"}, {"test/rcpsp/data_ksd15_d/j3012_3"},
            {"test/rcpsp/data_ksd15_d/j3012_4"}, {"test/rcpsp/data_ksd15_d/j3012_5"}, {"test/rcpsp/data_ksd15_d/j3012_6"},
            {"test/rcpsp/data_ksd15_d/j3012_7"}, {"test/rcpsp/data_ksd15_d/j3012_8"}, {"test/rcpsp/data_ksd15_d/j3012_9"},
            {"test/rcpsp/data_ksd15_d/j3012_10"}, {"test/rcpsp/data_ksd15_d/j3013_1"}, {"test/rcpsp/data_ksd15_d/j3013_2"},
            {"test/rcpsp/data_ksd15_d/j3013_3"}, {"test/rcpsp/data_ksd15_d/j3013_4"}, {"test/rcpsp/data_ksd15_d/j3013_5"},
            {"test/rcpsp/data_ksd15_d/j3013_6"}, {"test/rcpsp/data_ksd15_d/j3013_7"}, {"test/rcpsp/data_ksd15_d/j3013_8"},
            {"test/rcpsp/data_ksd15_d/j3013_9"}, {"test/rcpsp/data_ksd15_d/j3013_10"}, {"test/rcpsp/data_ksd15_d/j3014_1"},
            {"test/rcpsp/data_ksd15_d/j3014_2"}, {"test/rcpsp/data_ksd15_d/j3014_3"}, {"test/rcpsp/data_ksd15_d/j3014_4"},
            {"test/rcpsp/data_ksd15_d/j3014_5"}, {"test/rcpsp/data_ksd15_d/j3014_6"}, {"test/rcpsp/data_ksd15_d/j3014_7"},
            {"test/rcpsp/data_ksd15_d/j3014_8"}, {"test/rcpsp/data_ksd15_d/j3014_9"}, {"test/rcpsp/data_ksd15_d/j3014_10"},
            {"test/rcpsp/data_ksd15_d/j3015_1"}, {"test/rcpsp/data_ksd15_d/j3015_2"}, {"test/rcpsp/data_ksd15_d/j3015_3"},
            {"test/rcpsp/data_ksd15_d/j3015_4"}, {"test/rcpsp/data_ksd15_d/j3015_5"}, {"test/rcpsp/data_ksd15_d/j3015_6"},
            {"test/rcpsp/data_ksd15_d/j3015_7"}, {"test/rcpsp/data_ksd15_d/j3015_8"}, {"test/rcpsp/data_ksd15_d/j3015_9"},
            {"test/rcpsp/data_ksd15_d/j3015_10"}, {"test/rcpsp/data_ksd15_d/j3016_1"}, {"test/rcpsp/data_ksd15_d/j3016_2"},
            {"test/rcpsp/data_ksd15_d/j3016_3"}, {"test/rcpsp/data_ksd15_d/j3016_4"}, {"test/rcpsp/data_ksd15_d/j3016_5"},
            {"test/rcpsp/data_ksd15_d/j3016_6"}, {"test/rcpsp/data_ksd15_d/j3016_7"}, {"test/rcpsp/data_ksd15_d/j3016_8"},
            {"test/rcpsp/data_ksd15_d/j3016_9"}, {"test/rcpsp/data_ksd15_d/j3016_10"}, {"test/rcpsp/data_ksd15_d/j3017_1"},
            {"test/rcpsp/data_ksd15_d/j3017_2"}, {"test/rcpsp/data_ksd15_d/j3017_3"}, {"test/rcpsp/data_ksd15_d/j3017_4"},
            {"test/rcpsp/data_ksd15_d/j3017_5"}, {"test/rcpsp/data_ksd15_d/j3017_6"}, {"test/rcpsp/data_ksd15_d/j3017_7"},
            {"test/rcpsp/data_ksd15_d/j3017_8"}, {"test/rcpsp/data_ksd15_d/j3017_9"}, {"test/rcpsp/data_ksd15_d/j3017_10"},
            {"test/rcpsp/data_ksd15_d/j3018_1"}, {"test/rcpsp/data_ksd15_d/j3018_2"}, {"test/rcpsp/data_ksd15_d/j3018_3"},
            {"test/rcpsp/data_ksd15_d/j3018_4"}, {"test/rcpsp/data_ksd15_d/j3018_5"}, {"test/rcpsp/data_ksd15_d/j3018_6"},
            {"test/rcpsp/data_ksd15_d/j3018_7"}, {"test/rcpsp/data_ksd15_d/j3018_8"}, {"test/rcpsp/data_ksd15_d/j3018_9"},
            {"test/rcpsp/data_ksd15_d/j3018_10"}, {"test/rcpsp/data_ksd15_d/j3019_1"}, {"test/rcpsp/data_ksd15_d/j3019_2"},
            {"test/rcpsp/data_ksd15_d/j3019_3"}, {"test/rcpsp/data_ksd15_d/j3019_4"}, {"test/rcpsp/data_ksd15_d/j3019_5"},
            {"test/rcpsp/data_ksd15_d/j3019_6"}, {"test/rcpsp/data_ksd15_d/j3019_7"}, {"test/rcpsp/data_ksd15_d/j3019_8"},
            {"test/rcpsp/data_ksd15_d/j3019_9"}, {"test/rcpsp/data_ksd15_d/j3019_10"}, {"test/rcpsp/data_ksd15_d/j3020_1"},
            {"test/rcpsp/data_ksd15_d/j3020_2"}, {"test/rcpsp/data_ksd15_d/j3020_3"}, {"test/rcpsp/data_ksd15_d/j3020_4"},
            {"test/rcpsp/data_ksd15_d/j3020_5"}, {"test/rcpsp/data_ksd15_d/j3020_6"}, {"test/rcpsp/data_ksd15_d/j3020_7"},
            {"test/rcpsp/data_ksd15_d/j3020_8"}, {"test/rcpsp/data_ksd15_d/j3020_9"}, {"test/rcpsp/data_ksd15_d/j3020_10"},
            {"test/rcpsp/data_ksd15_d/j3021_1"}, {"test/rcpsp/data_ksd15_d/j3021_2"}, {"test/rcpsp/data_ksd15_d/j3021_3"},
            {"test/rcpsp/data_ksd15_d/j3021_4"}, {"test/rcpsp/data_ksd15_d/j3021_5"}, {"test/rcpsp/data_ksd15_d/j3021_6"},
            {"test/rcpsp/data_ksd15_d/j3021_7"}, {"test/rcpsp/data_ksd15_d/j3021_8"}, {"test/rcpsp/data_ksd15_d/j3021_9"},
            {"test/rcpsp/data_ksd15_d/j3021_10"}, {"test/rcpsp/data_ksd15_d/j3022_1"}, {"test/rcpsp/data_ksd15_d/j3022_2"},
            {"test/rcpsp/data_ksd15_d/j3022_3"}, {"test/rcpsp/data_ksd15_d/j3022_4"}, {"test/rcpsp/data_ksd15_d/j3022_5"},
            {"test/rcpsp/data_ksd15_d/j3022_6"}, {"test/rcpsp/data_ksd15_d/j3022_7"}, {"test/rcpsp/data_ksd15_d/j3022_8"},
            {"test/rcpsp/data_ksd15_d/j3022_9"}, {"test/rcpsp/data_ksd15_d/j3022_10"}, {"test/rcpsp/data_ksd15_d/j3023_1"},
            {"test/rcpsp/data_ksd15_d/j3023_2"}, {"test/rcpsp/data_ksd15_d/j3023_3"}, {"test/rcpsp/data_ksd15_d/j3023_4"},
            {"test/rcpsp/data_ksd15_d/j3023_5"}, {"test/rcpsp/data_ksd15_d/j3023_6"}, {"test/rcpsp/data_ksd15_d/j3023_7"},
            {"test/rcpsp/data_ksd15_d/j3023_8"}, {"test/rcpsp/data_ksd15_d/j3023_9"}, {"test/rcpsp/data_ksd15_d/j3023_10"},
            {"test/rcpsp/data_ksd15_d/j3024_1"}, {"test/rcpsp/data_ksd15_d/j3024_2"}, {"test/rcpsp/data_ksd15_d/j3024_3"},
            {"test/rcpsp/data_ksd15_d/j3024_4"}, {"test/rcpsp/data_ksd15_d/j3024_5"}, {"test/rcpsp/data_ksd15_d/j3024_6"},
            {"test/rcpsp/data_ksd15_d/j3024_7"}, {"test/rcpsp/data_ksd15_d/j3024_8"}, {"test/rcpsp/data_ksd15_d/j3024_9"},
            {"test/rcpsp/data_ksd15_d/j3024_10"}, {"test/rcpsp/data_ksd15_d/j3025_1"}, {"test/rcpsp/data_ksd15_d/j3025_2"},
            {"test/rcpsp/data_ksd15_d/j3025_3"}, {"test/rcpsp/data_ksd15_d/j3025_4"}, {"test/rcpsp/data_ksd15_d/j3025_5"},
            {"test/rcpsp/data_ksd15_d/j3025_6"}, {"test/rcpsp/data_ksd15_d/j3025_7"}, {"test/rcpsp/data_ksd15_d/j3025_8"},
            {"test/rcpsp/data_ksd15_d/j3025_9"}, {"test/rcpsp/data_ksd15_d/j3025_10"}, {"test/rcpsp/data_ksd15_d/j3026_1"},
            {"test/rcpsp/data_ksd15_d/j3026_2"}, {"test/rcpsp/data_ksd15_d/j3026_3"}, {"test/rcpsp/data_ksd15_d/j3026_4"},
            {"test/rcpsp/data_ksd15_d/j3026_5"}, {"test/rcpsp/data_ksd15_d/j3026_6"}, {"test/rcpsp/data_ksd15_d/j3026_7"},
            {"test/rcpsp/data_ksd15_d/j3026_8"}, {"test/rcpsp/data_ksd15_d/j3026_9"}, {"test/rcpsp/data_ksd15_d/j3026_10"},
            {"test/rcpsp/data_ksd15_d/j3027_1"}, {"test/rcpsp/data_ksd15_d/j3027_2"}, {"test/rcpsp/data_ksd15_d/j3027_3"},
            {"test/rcpsp/data_ksd15_d/j3027_4"}, {"test/rcpsp/data_ksd15_d/j3027_5"}, {"test/rcpsp/data_ksd15_d/j3027_6"},
            {"test/rcpsp/data_ksd15_d/j3027_7"}, {"test/rcpsp/data_ksd15_d/j3027_8"}, {"test/rcpsp/data_ksd15_d/j3027_9"},
            {"test/rcpsp/data_ksd15_d/j3027_10"}, {"test/rcpsp/data_ksd15_d/j3028_1"}, {"test/rcpsp/data_ksd15_d/j3028_2"},
            {"test/rcpsp/data_ksd15_d/j3028_3"}, {"test/rcpsp/data_ksd15_d/j3028_4"}, {"test/rcpsp/data_ksd15_d/j3028_5"},
            {"test/rcpsp/data_ksd15_d/j3028_6"}, {"test/rcpsp/data_ksd15_d/j3028_7"}, {"test/rcpsp/data_ksd15_d/j3028_8"},
            {"test/rcpsp/data_ksd15_d/j3028_9"}, {"test/rcpsp/data_ksd15_d/j3028_10"}, {"test/rcpsp/data_ksd15_d/j3029_1"},
            {"test/rcpsp/data_ksd15_d/j3029_2"}, {"test/rcpsp/data_ksd15_d/j3029_3"}, {"test/rcpsp/data_ksd15_d/j3029_4"},
            {"test/rcpsp/data_ksd15_d/j3029_5"}, {"test/rcpsp/data_ksd15_d/j3029_6"}, {"test/rcpsp/data_ksd15_d/j3029_7"},
            {"test/rcpsp/data_ksd15_d/j3029_8"}, {"test/rcpsp/data_ksd15_d/j3029_9"}, {"test/rcpsp/data_ksd15_d/j3029_10"},
            {"test/rcpsp/data_ksd15_d/j3030_1"}, {"test/rcpsp/data_ksd15_d/j3030_2"}, {"test/rcpsp/data_ksd15_d/j3030_3"},
            {"test/rcpsp/data_ksd15_d/j3030_4"}, {"test/rcpsp/data_ksd15_d/j3030_5"}, {"test/rcpsp/data_ksd15_d/j3030_6"},
            {"test/rcpsp/data_ksd15_d/j3030_7"}, {"test/rcpsp/data_ksd15_d/j3030_8"}, {"test/rcpsp/data_ksd15_d/j3030_9"},
            {"test/rcpsp/data_ksd15_d/j3030_10"}, {"test/rcpsp/data_ksd15_d/j3031_1"}, {"test/rcpsp/data_ksd15_d/j3031_2"},
            {"test/rcpsp/data_ksd15_d/j3031_3"}, {"test/rcpsp/data_ksd15_d/j3031_4"}, {"test/rcpsp/data_ksd15_d/j3031_5"},
            {"test/rcpsp/data_ksd15_d/j3031_6"}, {"test/rcpsp/data_ksd15_d/j3031_7"}, {"test/rcpsp/data_ksd15_d/j3031_8"},
            {"test/rcpsp/data_ksd15_d/j3031_9"}, {"test/rcpsp/data_ksd15_d/j3031_10"}, {"test/rcpsp/data_ksd15_d/j3032_1"},
            {"test/rcpsp/data_ksd15_d/j3032_2"}, {"test/rcpsp/data_ksd15_d/j3032_3"}, {"test/rcpsp/data_ksd15_d/j3032_4"},
            {"test/rcpsp/data_ksd15_d/j3032_5"}, {"test/rcpsp/data_ksd15_d/j3032_6"}, {"test/rcpsp/data_ksd15_d/j3032_7"},
            {"test/rcpsp/data_ksd15_d/j3032_8"}, {"test/rcpsp/data_ksd15_d/j3032_9"}, {"test/rcpsp/data_ksd15_d/j3032_10"},
            {"test/rcpsp/data_ksd15_d/j3033_1"}, {"test/rcpsp/data_ksd15_d/j3033_2"}, {"test/rcpsp/data_ksd15_d/j3033_3"},
            {"test/rcpsp/data_ksd15_d/j3033_4"}, {"test/rcpsp/data_ksd15_d/j3033_5"}, {"test/rcpsp/data_ksd15_d/j3033_6"},
            {"test/rcpsp/data_ksd15_d/j3033_7"}, {"test/rcpsp/data_ksd15_d/j3033_8"}, {"test/rcpsp/data_ksd15_d/j3033_9"},
            {"test/rcpsp/data_ksd15_d/j3033_10"}, {"test/rcpsp/data_ksd15_d/j3034_1"}, {"test/rcpsp/data_ksd15_d/j3034_2"},
            {"test/rcpsp/data_ksd15_d/j3034_3"}, {"test/rcpsp/data_ksd15_d/j3034_4"}, {"test/rcpsp/data_ksd15_d/j3034_5"},
            {"test/rcpsp/data_ksd15_d/j3034_6"}, {"test/rcpsp/data_ksd15_d/j3034_7"}, {"test/rcpsp/data_ksd15_d/j3034_8"},
            {"test/rcpsp/data_ksd15_d/j3034_9"}, {"test/rcpsp/data_ksd15_d/j3034_10"}, {"test/rcpsp/data_ksd15_d/j3035_1"},
            {"test/rcpsp/data_ksd15_d/j3035_2"}, {"test/rcpsp/data_ksd15_d/j3035_3"}, {"test/rcpsp/data_ksd15_d/j3035_4"},
            {"test/rcpsp/data_ksd15_d/j3035_5"}, {"test/rcpsp/data_ksd15_d/j3035_6"}, {"test/rcpsp/data_ksd15_d/j3035_7"},
            {"test/rcpsp/data_ksd15_d/j3035_8"}, {"test/rcpsp/data_ksd15_d/j3035_9"}, {"test/rcpsp/data_ksd15_d/j3035_10"},
            {"test/rcpsp/data_ksd15_d/j3036_1"}, {"test/rcpsp/data_ksd15_d/j3036_2"}, {"test/rcpsp/data_ksd15_d/j3036_3"},
            {"test/rcpsp/data_ksd15_d/j3036_4"}, {"test/rcpsp/data_ksd15_d/j3036_5"}, {"test/rcpsp/data_ksd15_d/j3036_6"},
            {"test/rcpsp/data_ksd15_d/j3036_7"}, {"test/rcpsp/data_ksd15_d/j3036_8"}, {"test/rcpsp/data_ksd15_d/j3036_9"},
            {"test/rcpsp/data_ksd15_d/j3036_10"}, {"test/rcpsp/data_ksd15_d/j3037_1"}, {"test/rcpsp/data_ksd15_d/j3037_2"},
            {"test/rcpsp/data_ksd15_d/j3037_3"}, {"test/rcpsp/data_ksd15_d/j3037_4"}, {"test/rcpsp/data_ksd15_d/j3037_5"},
            {"test/rcpsp/data_ksd15_d/j3038_6"}, {"test/rcpsp/data_ksd15_d/j3038_7"}, {"test/rcpsp/data_ksd15_d/j3038_8"},
            {"test/rcpsp/data_ksd15_d/j3038_9"}, {"test/rcpsp/data_ksd15_d/j3038_10"}, {"test/rcpsp/data_ksd15_d/j3039_1"},
            {"test/rcpsp/data_ksd15_d/j3039_2"}, {"test/rcpsp/data_ksd15_d/j3039_3"}, {"test/rcpsp/data_ksd15_d/j3039_4"},
            {"test/rcpsp/data_ksd15_d/j3039_5"}, {"test/rcpsp/data_ksd15_d/j3039_6"}, {"test/rcpsp/data_ksd15_d/j3039_7"},
            {"test/rcpsp/data_ksd15_d/j3039_8"}, {"test/rcpsp/data_ksd15_d/j3039_9"}, {"test/rcpsp/data_ksd15_d/j3039_10"},
            {"test/rcpsp/data_ksd15_d/j3040_1"}, {"test/rcpsp/data_ksd15_d/j3040_2"}, {"test/rcpsp/data_ksd15_d/j3040_3"},
            {"test/rcpsp/data_ksd15_d/j3040_4"}, {"test/rcpsp/data_ksd15_d/j3040_5"}, {"test/rcpsp/data_ksd15_d/j3040_6"},
            {"test/rcpsp/data_ksd15_d/j3040_7"}, {"test/rcpsp/data_ksd15_d/j3040_8"}, {"test/rcpsp/data_ksd15_d/j3040_9"},
            {"test/rcpsp/data_ksd15_d/j3040_10"}, {"test/rcpsp/data_ksd15_d/j3041_1"}, {"test/rcpsp/data_ksd15_d/j3041_2"},
            {"test/rcpsp/data_ksd15_d/j3041_3"}, {"test/rcpsp/data_ksd15_d/j3041_4"}, {"test/rcpsp/data_ksd15_d/j3041_5"},
            {"test/rcpsp/data_ksd15_d/j3041_6"}, {"test/rcpsp/data_ksd15_d/j3041_7"}, {"test/rcpsp/data_ksd15_d/j3041_8"},
            {"test/rcpsp/data_ksd15_d/j3041_9"}, {"test/rcpsp/data_ksd15_d/j3041_10"}, {"test/rcpsp/data_ksd15_d/j3042_1"},
            {"test/rcpsp/data_ksd15_d/j3042_2"}, {"test/rcpsp/data_ksd15_d/j3042_3"}, {"test/rcpsp/data_ksd15_d/j3042_4"},
            {"test/rcpsp/data_ksd15_d/j3042_5"}, {"test/rcpsp/data_ksd15_d/j3042_6"}, {"test/rcpsp/data_ksd15_d/j3042_7"},
            {"test/rcpsp/data_ksd15_d/j3042_8"}, {"test/rcpsp/data_ksd15_d/j3042_9"}, {"test/rcpsp/data_ksd15_d/j3042_10"},
            {"test/rcpsp/data_ksd15_d/j3043_1"}, {"test/rcpsp/data_ksd15_d/j3043_2"}, {"test/rcpsp/data_ksd15_d/j3043_3"},
            {"test/rcpsp/data_ksd15_d/j3043_4"}, {"test/rcpsp/data_ksd15_d/j3043_5"}, {"test/rcpsp/data_ksd15_d/j3043_6"},
            {"test/rcpsp/data_ksd15_d/j3043_7"}, {"test/rcpsp/data_ksd15_d/j3043_8"}, {"test/rcpsp/data_ksd15_d/j3043_9"},
            {"test/rcpsp/data_ksd15_d/j3043_10"}, {"test/rcpsp/data_ksd15_d/j3044_1"}, {"test/rcpsp/data_ksd15_d/j3044_2"},
            {"test/rcpsp/data_ksd15_d/j3044_3"}, {"test/rcpsp/data_ksd15_d/j3044_4"}, {"test/rcpsp/data_ksd15_d/j3044_5"},
            {"test/rcpsp/data_ksd15_d/j3044_6"}, {"test/rcpsp/data_ksd15_d/j3044_7"}, {"test/rcpsp/data_ksd15_d/j3044_8"},
            {"test/rcpsp/data_ksd15_d/j3044_9"}, {"test/rcpsp/data_ksd15_d/j3044_10"}, {"test/rcpsp/data_ksd15_d/j3045_1"},
            {"test/rcpsp/data_ksd15_d/j3045_2"}, {"test/rcpsp/data_ksd15_d/j3045_3"}, {"test/rcpsp/data_ksd15_d/j3045_4"},
            {"test/rcpsp/data_ksd15_d/j3045_5"}, {"test/rcpsp/data_ksd15_d/j3045_6"}, {"test/rcpsp/data_ksd15_d/j3045_7"},
            {"test/rcpsp/data_ksd15_d/j3045_8"}, {"test/rcpsp/data_ksd15_d/j3045_9"}, {"test/rcpsp/data_ksd15_d/j3045_10"},
            {"test/rcpsp/data_ksd15_d/j3046_1"}, {"test/rcpsp/data_ksd15_d/j3046_2"}, {"test/rcpsp/data_ksd15_d/j3046_3"},
            {"test/rcpsp/data_ksd15_d/j3046_4"}, {"test/rcpsp/data_ksd15_d/j3046_5"}, {"test/rcpsp/data_ksd15_d/j3046_6"},
            {"test/rcpsp/data_ksd15_d/j3046_7"}, {"test/rcpsp/data_ksd15_d/j3046_8"}, {"test/rcpsp/data_ksd15_d/j3046_9"},
            {"test/rcpsp/data_ksd15_d/j3046_10"}, {"test/rcpsp/data_ksd15_d/j3047_1"}, {"test/rcpsp/data_ksd15_d/j3047_2"},
            {"test/rcpsp/data_ksd15_d/j3047_3"}, {"test/rcpsp/data_ksd15_d/j3047_4"}, {"test/rcpsp/data_ksd15_d/j3047_5"},
            {"test/rcpsp/data_ksd15_d/j3047_6"}, {"test/rcpsp/data_ksd15_d/j3047_7"}, {"test/rcpsp/data_ksd15_d/j3047_8"},
            {"test/rcpsp/data_ksd15_d/j3047_9"}, {"test/rcpsp/data_ksd15_d/j3047_10"}, {"test/rcpsp/data_ksd15_d/j3048_1"},
            {"test/rcpsp/data_ksd15_d/j3048_2"}, {"test/rcpsp/data_ksd15_d/j3048_3"}, {"test/rcpsp/data_ksd15_d/j3048_4"},
            {"test/rcpsp/data_ksd15_d/j3048_5"}, {"test/rcpsp/data_ksd15_d/j3048_6"}, {"test/rcpsp/data_ksd15_d/j3048_7"},
            {"test/rcpsp/data_ksd15_d/j3048_8"}, {"test/rcpsp/data_ksd15_d/j3048_9"}, {"test/rcpsp/data_ksd15_d/j3048_10"},
            {"test/rcpsp/data_la_x/la01_x2"}, {"test/rcpsp/data_la_x/la01_x3"}, {"test/rcpsp/data_la_x/la02_x2"},
            {"test/rcpsp/data_la_x/la02_x3"}, {"test/rcpsp/data_la_x/la03_x2"}, {"test/rcpsp/data_la_x/la03_x3"},
            {"test/rcpsp/data_la_x/la04_x2"}, {"test/rcpsp/data_la_x/la04_x3"}, {"test/rcpsp/data_la_x/la05_x2"},
            {"test/rcpsp/data_la_x/la05_x3"}, {"test/rcpsp/data_la_x/la06_x2"}, {"test/rcpsp/data_la_x/la06_x3"},
            {"test/rcpsp/data_la_x/la07_x2"}, {"test/rcpsp/data_la_x/la07_x3"}, {"test/rcpsp/data_la_x/la08_x2"},
            {"test/rcpsp/data_la_x/la08_x3"}, {"test/rcpsp/data_la_x/la09_x2"}, {"test/rcpsp/data_la_x/la09_x3"},
            {"test/rcpsp/data_la_x/la10_x2"}, {"test/rcpsp/data_la_x/la10_x3"}, {"test/rcpsp/data_la_x/la11_x2"},
            {"test/rcpsp/data_la_x/la11_x3"}, {"test/rcpsp/data_la_x/la12_x2"}, {"test/rcpsp/data_la_x/la12_x3"},
            {"test/rcpsp/data_la_x/la13_x2"}, {"test/rcpsp/data_la_x/la13_x3"}, {"test/rcpsp/data_la_x/la14_x2"},
            {"test/rcpsp/data_la_x/la14_x3"}, {"test/rcpsp/data_la_x/la15_x2"}, {"test/rcpsp/data_la_x/la15_x3"},
            {"test/rcpsp/data_la_x/la16_x2"}, {"test/rcpsp/data_la_x/la16_x3"}, {"test/rcpsp/data_la_x/la17_x2"},
            {"test/rcpsp/data_la_x/la17_x3"}, {"test/rcpsp/data_la_x/la18_x2"}, {"test/rcpsp/data_la_x/la18_x3"},
            {"test/rcpsp/data_la_x/la19_x2"}, {"test/rcpsp/data_la_x/la19_x3"}, {"test/rcpsp/data_la_x/la20_x2"},
            {"test/rcpsp/data_la_x/la20_x3"}, {"test/rcpsp/data_la_x/la21_x2"}, {"test/rcpsp/data_la_x/la21_x3"},
            {"test/rcpsp/data_la_x/la22_x2"}, {"test/rcpsp/data_la_x/la22_x3"}, {"test/rcpsp/data_la_x/la23_x2"},
            {"test/rcpsp/data_la_x/la23_x3"}, {"test/rcpsp/data_la_x/la24_x2"}, {"test/rcpsp/data_la_x/la24_x3"},
            {"test/rcpsp/data_la_x/la25_x2"}, {"test/rcpsp/data_la_x/la25_x3"}, {"test/rcpsp/data_la_x/la26_x2"},
            {"test/rcpsp/data_la_x/la26_x3"}, {"test/rcpsp/data_la_x/la27_x2"}, {"test/rcpsp/data_la_x/la27_x3"},
            {"test/rcpsp/data_la_x/la28_x2"}, {"test/rcpsp/data_la_x/la28_x3"}, {"test/rcpsp/data_la_x/la29_x2"},
            {"test/rcpsp/data_la_x/la29_x3"}, {"test/rcpsp/data_la_x/la30_x2"}, {"test/rcpsp/data_la_x/la30_x3"},
            {"test/rcpsp/data_la_x/la31_x2"}, {"test/rcpsp/data_la_x/la31_x3"}, {"test/rcpsp/data_la_x/la32_x2"},
            {"test/rcpsp/data_la_x/la32_x3"}, {"test/rcpsp/data_la_x/la33_x2"}, {"test/rcpsp/data_la_x/la33_x3"},
            {"test/rcpsp/data_la_x/la34_x2"}, {"test/rcpsp/data_la_x/la34_x3"}, {"test/rcpsp/data_la_x/la35_x2"},
            {"test/rcpsp/data_la_x/la35_x3"}, {"test/rcpsp/data_la_x/la36_x2"}, {"test/rcpsp/data_la_x/la36_x3"},
            {"test/rcpsp/data_la_x/la37_x2"}, {"test/rcpsp/data_la_x/la37_x3"}, {"test/rcpsp/data_la_x/la38_x2"},
            {"test/rcpsp/data_la_x/la38_x3"}, {"test/rcpsp/data_la_x/la39_x2"}, {"test/rcpsp/data_la_x/la39_x3"},
            {"test/rcpsp/data_la_x/la40_x2"}, {"test/rcpsp/data_la_x/la40_x3"}, {"test/rcpsp/data_pack/pack001"},
            {"test/rcpsp/data_pack/pack002"}, {"test/rcpsp/data_pack/pack003"}, {"test/rcpsp/data_pack/pack004"},
            {"test/rcpsp/data_pack/pack005"}, {"test/rcpsp/data_pack/pack006"}, {"test/rcpsp/data_pack/pack007"},
            {"test/rcpsp/data_pack/pack008"}, {"test/rcpsp/data_pack/pack009"}, {"test/rcpsp/data_pack/pack010"},
            {"test/rcpsp/data_pack/pack011"}, {"test/rcpsp/data_pack/pack012"}, {"test/rcpsp/data_pack/pack013"},
            {"test/rcpsp/data_pack/pack014"}, {"test/rcpsp/data_pack/pack015"}, {"test/rcpsp/data_pack/pack016"},
            {"test/rcpsp/data_pack/pack017"}, {"test/rcpsp/data_pack/pack018"}, {"test/rcpsp/data_pack/pack019"},
            {"test/rcpsp/data_pack/pack020"}, {"test/rcpsp/data_pack/pack021"}, {"test/rcpsp/data_pack/pack022"},
            {"test/rcpsp/data_pack/pack023"}, {"test/rcpsp/data_pack/pack024"}, {"test/rcpsp/data_pack/pack025"},
            {"test/rcpsp/data_pack/pack026"}, {"test/rcpsp/data_pack/pack027"}, {"test/rcpsp/data_pack/pack028"},
            {"test/rcpsp/data_pack/pack029"}, {"test/rcpsp/data_pack/pack030"}, {"test/rcpsp/data_pack/pack031"},
            {"test/rcpsp/data_pack/pack032"}, {"test/rcpsp/data_pack/pack033"}, {"test/rcpsp/data_pack/pack034"},
            {"test/rcpsp/data_pack/pack035"}, {"test/rcpsp/data_pack/pack036"}, {"test/rcpsp/data_pack/pack037"},
            {"test/rcpsp/data_pack/pack038"}, {"test/rcpsp/data_pack/pack039"}, {"test/rcpsp/data_pack/pack040"},
            {"test/rcpsp/data_pack/pack041"}, {"test/rcpsp/data_pack/pack042"}, {"test/rcpsp/data_pack/pack043"},
            {"test/rcpsp/data_pack/pack044"}, {"test/rcpsp/data_pack/pack045"}, {"test/rcpsp/data_pack/pack046"},
            {"test/rcpsp/data_pack/pack047"}, {"test/rcpsp/data_pack/pack048"}, {"test/rcpsp/data_pack/pack049"},
            {"test/rcpsp/data_pack/pack050"}, {"test/rcpsp/data_pack/pack051"}, {"test/rcpsp/data_pack/pack052"},
            {"test/rcpsp/data_pack/pack053"}, {"test/rcpsp/data_pack/pack054"}, {"test/rcpsp/data_pack/pack055"},
            {"rcpsp/data_pack_d/pack001"}, {"rcpsp/data_pack_d/pack002"}, {"rcpsp/data_pack_d/pack003"}, {"rcpsp/data_pack_d/pack004"},
            {"rcpsp/data_pack_d/pack005"}, {"rcpsp/data_pack_d/pack006"}, {"rcpsp/data_pack_d/pack007"}, {"rcpsp/data_pack_d/pack008"},
            {"rcpsp/data_pack_d/pack009"}, {"rcpsp/data_pack_d/pack010"}, {"rcpsp/data_pack_d/pack011"}, {"rcpsp/data_pack_d/pack012"},
            {"rcpsp/data_pack_d/pack013"}, {"rcpsp/data_pack_d/pack014"}, {"rcpsp/data_pack_d/pack015"}, {"rcpsp/data_pack_d/pack016"},
            {"rcpsp/data_pack_d/pack017"}, {"rcpsp/data_pack_d/pack018"}, {"rcpsp/data_pack_d/pack019"}, {"rcpsp/data_pack_d/pack020"},
            {"rcpsp/data_pack_d/pack021"}, {"rcpsp/data_pack_d/pack022"}, {"rcpsp/data_pack_d/pack023"}, {"rcpsp/data_pack_d/pack024"},
            {"rcpsp/data_pack_d/pack025"}, {"rcpsp/data_pack_d/pack026"}, {"rcpsp/data_pack_d/pack027"}, {"rcpsp/data_pack_d/pack028"},
            {"rcpsp/data_pack_d/pack029"}, {"rcpsp/data_pack_d/pack030"}, {"rcpsp/data_pack_d/pack031"}, {"rcpsp/data_pack_d/pack032"},
            {"rcpsp/data_pack_d/pack033"}, {"rcpsp/data_pack_d/pack034"}, {"rcpsp/data_pack_d/pack035"}, {"rcpsp/data_pack_d/pack036"},
            {"rcpsp/data_pack_d/pack037"}, {"rcpsp/data_pack_d/pack038"}, {"rcpsp/data_pack_d/pack039"}, {"rcpsp/data_pack_d/pack040"},
            {"rcpsp/data_pack_d/pack041"}, {"rcpsp/data_pack_d/pack042"}, {"rcpsp/data_pack_d/pack043"}, {"rcpsp/data_pack_d/pack044"},
            {"rcpsp/data_pack_d/pack045"}, {"rcpsp/data_pack_d/pack046"}, {"rcpsp/data_pack_d/pack047"}, {"rcpsp/data_pack_d/pack048"},
            {"rcpsp/data_pack_d/pack049"}, {"rcpsp/data_pack_d/pack050"}, {"rcpsp/data_pack_d/pack051"}, {"rcpsp/data_pack_d/pack052"},
            {"rcpsp/data_pack_d/pack053"}, {"rcpsp/data_pack_d/pack054"}, {"rcpsp/data_pack_d/pack055"},



            //data_psplib
            {"test/rcpsp/data_psplib/J30/J30_1_1"}, {"test/rcpsp/data_psplib/J30/J30_1_2"}, {"test/rcpsp/data_psplib/J30/J30_1_3"},
            {"test/rcpsp/data_psplib/J30/J30_1_4"}, {"test/rcpsp/data_psplib/J30/J30_1_5"}, {"test/rcpsp/data_psplib/J30/J30_1_6"},
            {"test/rcpsp/data_psplib/J30/J30_1_7"}, {"test/rcpsp/data_psplib/J30/J30_1_8"}, {"test/rcpsp/data_psplib/J30/J30_1_10"},
            {"test/rcpsp/data_psplib/J30/J30_2_1"}, {"test/rcpsp/data_psplib/J30/J30_2_2"}, {"test/rcpsp/data_psplib/J30/J30_2_3"},
            {"test/rcpsp/data_psplib/J30/J30_2_4"}, {"test/rcpsp/data_psplib/J30/J30_2_5"}, {"test/rcpsp/data_psplib/J30/J30_2_6"},
            {"test/rcpsp/data_psplib/J30/J30_2_7"}, {"test/rcpsp/data_psplib/J30/J30_2_8"}, {"test/rcpsp/data_psplib/J30/J30_2_9"},
            {"test/rcpsp/data_psplib/J30/J30_2_10"}, {"test/rcpsp/data_psplib/J30/J30_3_1"}, {"test/rcpsp/data_psplib/J30/J30_3_2"},
            {"test/rcpsp/data_psplib/J30/J30_3_3"}, {"test/rcpsp/data_psplib/J30/J30_3_4"}, {"test/rcpsp/data_psplib/J30/J30_3_5"},
            {"test/rcpsp/data_psplib/J30/J30_3_6"}, {"test/rcpsp/data_psplib/J30/J30_3_7"}, {"test/rcpsp/data_psplib/J30/J30_3_8"},
            {"test/rcpsp/data_psplib/J30/J30_3_9"}, {"test/rcpsp/data_psplib/J30/J30_3_10"}, {"test/rcpsp/data_psplib/J30/J30_4_1"},
            {"test/rcpsp/data_psplib/J30/J30_4_2"}, {"test/rcpsp/data_psplib/J30/J30_4_3"}, {"test/rcpsp/data_psplib/J30/J30_4_4"},
            {"test/rcpsp/data_psplib/J30/J30_4_5"}, {"test/rcpsp/data_psplib/J30/J30_4_6"}, {"test/rcpsp/data_psplib/J30/J30_4_7"},
            {"test/rcpsp/data_psplib/J30/J30_4_8"}, {"test/rcpsp/data_psplib/J30/J30_4_9"}, {"test/rcpsp/data_psplib/J30/J30_4_10"},
            {"test/rcpsp/data_psplib/J30/J30_5_1"}, {"test/rcpsp/data_psplib/J30/J30_5_2"}, {"test/rcpsp/data_psplib/J30/J30_5_3"},
            {"test/rcpsp/data_psplib/J30/J30_5_4"}, {"test/rcpsp/data_psplib/J30/J30_5_5"}, {"test/rcpsp/data_psplib/J30/J30_5_6"},
            {"test/rcpsp/data_psplib/J30/J30_5_7"}, {"test/rcpsp/data_psplib/J30/J30_5_8"}, {"test/rcpsp/data_psplib/J30/J30_5_9"},
            {"test/rcpsp/data_psplib/J30/J30_5_10"}, {"test/rcpsp/data_psplib/J30/J30_6_1"}, {"test/rcpsp/data_psplib/J30/J30_6_2"},
            {"test/rcpsp/data_psplib/J30/J30_6_3"}, {"test/rcpsp/data_psplib/J30/J30_6_4"}, {"test/rcpsp/data_psplib/J30/J30_6_5"},
            {"test/rcpsp/data_psplib/J30/J30_6_6"}, {"test/rcpsp/data_psplib/J30/J30_6_7"}, {"test/rcpsp/data_psplib/J30/J30_6_8"},
            {"test/rcpsp/data_psplib/J30/J30_6_9"}, {"test/rcpsp/data_psplib/J30/J30_6_10"}, {"test/rcpsp/data_psplib/J30/J30_7_1"},
            {"test/rcpsp/data_psplib/J30/J30_7_2"}, {"test/rcpsp/data_psplib/J30/J30_7_3"}, {"test/rcpsp/data_psplib/J30/J30_7_4"},
            {"test/rcpsp/data_psplib/J30/J30_7_5"}, {"test/rcpsp/data_psplib/J30/J30_7_6"}, {"test/rcpsp/data_psplib/J30/J30_7_7"},
            {"test/rcpsp/data_psplib/J30/J30_7_8"}, {"test/rcpsp/data_psplib/J30/J30_7_9"}, {"test/rcpsp/data_psplib/J30/J30_7_10"},
            {"test/rcpsp/data_psplib/J30/J30_8_1"}, {"test/rcpsp/data_psplib/J30/J30_8_2"}, {"test/rcpsp/data_psplib/J30/J30_8_3"},
            {"test/rcpsp/data_psplib/J30/J30_8_4"}, {"test/rcpsp/data_psplib/J30/J30_8_5"}, {"test/rcpsp/data_psplib/J30/J30_8_6"},
            {"test/rcpsp/data_psplib/J30/J30_8_7"}, {"test/rcpsp/data_psplib/J30/J30_8_8"}, {"test/rcpsp/data_psplib/J30/J30_8_9"},
            {"test/rcpsp/data_psplib/J30/J30_8_10"}, {"test/rcpsp/data_psplib/J30/J30_9_1"}, {"test/rcpsp/data_psplib/J30/J30_9_2"},
            {"test/rcpsp/data_psplib/J30/J30_9_3"}, {"test/rcpsp/data_psplib/J30/J30_9_4"}, {"test/rcpsp/data_psplib/J30/J30_9_5"},
            {"test/rcpsp/data_psplib/J30/J30_9_6"}, {"test/rcpsp/data_psplib/J30/J30_9_7"}, {"test/rcpsp/data_psplib/J30/J30_9_8"},
            {"test/rcpsp/data_psplib/J30/J30_9_9"}, {"test/rcpsp/data_psplib/J30/J30_9_10"}, {"test/rcpsp/data_psplib/J30/J30_10_1"},
            {"test/rcpsp/data_psplib/J30/J30_10_2"}, {"test/rcpsp/data_psplib/J30/J30_10_3"}, {"test/rcpsp/data_psplib/J30/J30_10_4"},
            {"test/rcpsp/data_psplib/J30/J30_10_5"}, {"test/rcpsp/data_psplib/J30/J30_10_6"}, {"test/rcpsp/data_psplib/J30/J30_10_7"},
            {"test/rcpsp/data_psplib/J30/J30_10_8"}, {"test/rcpsp/data_psplib/J30/J30_10_9"}, {"test/rcpsp/data_psplib/J30/J30_10_10"},
            {"test/rcpsp/data_psplib/J30/J30_11_1"}, {"test/rcpsp/data_psplib/J30/J30_11_2"}, {"test/rcpsp/data_psplib/J30/J30_11_3"},
            {"test/rcpsp/data_psplib/J30/J30_11_4"}, {"test/rcpsp/data_psplib/J30/J30_11_5"}, {"test/rcpsp/data_psplib/J30/J30_11_6"},
            {"test/rcpsp/data_psplib/J30/J30_11_7"}, {"test/rcpsp/data_psplib/J30/J30_11_8"}, {"test/rcpsp/data_psplib/J30/J30_11_9"},
            {"test/rcpsp/data_psplib/J30/J30_12_1"}, {"test/rcpsp/data_psplib/J30/J30_12_2"}, {"test/rcpsp/data_psplib/J30/J30_12_3"},
            {"test/rcpsp/data_psplib/J30/J30_12_4"}, {"test/rcpsp/data_psplib/J30/J30_12_5"}, {"test/rcpsp/data_psplib/J30/J30_12_6"},
            {"test/rcpsp/data_psplib/J30/J30_12_7"}, {"test/rcpsp/data_psplib/J30/J30_12_8"}, {"test/rcpsp/data_psplib/J30/J30_12_9"},
            {"test/rcpsp/data_psplib/J30/J30_12_10"}, {"test/rcpsp/data_psplib/J30/J30_13_1"}, {"test/rcpsp/data_psplib/J30/J30_13_2"},
            {"test/rcpsp/data_psplib/J30/J30_13_3"}, {"test/rcpsp/data_psplib/J30/J30_13_4"}, {"test/rcpsp/data_psplib/J30/J30_13_5"},
            {"test/rcpsp/data_psplib/J30/J30_13_6"}, {"test/rcpsp/data_psplib/J30/J30_13_7"}, {"test/rcpsp/data_psplib/J30/J30_13_8"},
            {"test/rcpsp/data_psplib/J30/J30_13_9"}, {"test/rcpsp/data_psplib/J30/J30_13_10"}, {"test/rcpsp/data_psplib/J30/J30_14_1"},
            {"test/rcpsp/data_psplib/J30/J30_14_2"}, {"test/rcpsp/data_psplib/J30/J30_14_3"}, {"test/rcpsp/data_psplib/J30/J30_14_4"},
            {"test/rcpsp/data_psplib/J30/J30_14_5"}, {"test/rcpsp/data_psplib/J30/J30_14_6"}, {"test/rcpsp/data_psplib/J30/J30_14_7"},
            {"test/rcpsp/data_psplib/J30/J30_14_8"}, {"test/rcpsp/data_psplib/J30/J30_14_9"}, {"test/rcpsp/data_psplib/J30/J30_14_10"},
            {"test/rcpsp/data_psplib/J30/J30_15_1"}, {"test/rcpsp/data_psplib/J30/J30_15_2"}, {"test/rcpsp/data_psplib/J30/J30_15_3"},
            {"test/rcpsp/data_psplib/J30/J30_15_4"}, {"test/rcpsp/data_psplib/J30/J30_15_5"}, {"test/rcpsp/data_psplib/J30/J30_15_6"},
            {"test/rcpsp/data_psplib/J30/J30_15_7"}, {"test/rcpsp/data_psplib/J30/J30_15_8"}, {"test/rcpsp/data_psplib/J30/J30_15_9"},
            {"test/rcpsp/data_psplib/J30/J30_15_10"}, {"test/rcpsp/data_psplib/J30/J30_16_1"}, {"test/rcpsp/data_psplib/J30/J30_16_2"},
            {"test/rcpsp/data_psplib/J30/J30_16_3"}, {"test/rcpsp/data_psplib/J30/J30_16_4"}, {"test/rcpsp/data_psplib/J30/J30_16_5"},
            {"test/rcpsp/data_psplib/J30/J30_16_6"}, {"test/rcpsp/data_psplib/J30/J30_16_7"}, {"test/rcpsp/data_psplib/J30/J30_16_8"},
            {"test/rcpsp/data_psplib/J30/J30_16_9"}, {"test/rcpsp/data_psplib/J30/J30_16_10"}, {"test/rcpsp/data_psplib/J30/J30_17_1"},
            {"test/rcpsp/data_psplib/J30/J30_17_2"}, {"test/rcpsp/data_psplib/J30/J30_17_3"}, {"test/rcpsp/data_psplib/J30/J30_17_4"},
            {"test/rcpsp/data_psplib/J30/J30_17_5"}, {"test/rcpsp/data_psplib/J30/J30_17_6"}, {"test/rcpsp/data_psplib/J30/J30_17_7"},
            {"test/rcpsp/data_psplib/J30/J30_17_8"}, {"test/rcpsp/data_psplib/J30/J30_17_9"}, {"test/rcpsp/data_psplib/J30/J30_17_10"},
            {"test/rcpsp/data_psplib/J30/J30_18_1"}, {"test/rcpsp/data_psplib/J30/J30_18_2"}, {"test/rcpsp/data_psplib/J30/J30_18_3"},
            {"test/rcpsp/data_psplib/J30/J30_18_4"}, {"test/rcpsp/data_psplib/J30/J30_18_5"}, {"test/rcpsp/data_psplib/J30/J30_18_6"},
            {"test/rcpsp/data_psplib/J30/J30_18_7"}, {"test/rcpsp/data_psplib/J30/J30_18_8"}, {"test/rcpsp/data_psplib/J30/J30_18_9"},
            {"test/rcpsp/data_psplib/J30/J30_18_10"}, {"test/rcpsp/data_psplib/J30/J30_19_1"}, {"test/rcpsp/data_psplib/J30/J30_19_2"},
            {"test/rcpsp/data_psplib/J30/J30_19_3"}, {"test/rcpsp/data_psplib/J30/J30_19_4"}, {"test/rcpsp/data_psplib/J30/J30_19_5"},
            {"test/rcpsp/data_psplib/J30/J30_19_6"}, {"test/rcpsp/data_psplib/J30/J30_19_7"}, {"test/rcpsp/data_psplib/J30/J30_19_8"},
            {"test/rcpsp/data_psplib/J30/J30_19_9"}, {"test/rcpsp/data_psplib/J30/J30_19_10"}, {"test/rcpsp/data_psplib/J30/J30_20_1"},
            {"test/rcpsp/data_psplib/J30/J30_20_2"}, {"test/rcpsp/data_psplib/J30/J30_20_3"}, {"test/rcpsp/data_psplib/J30/J30_20_4"},
            {"test/rcpsp/data_psplib/J30/J30_20_5"}, {"test/rcpsp/data_psplib/J30/J30_20_6"}, {"test/rcpsp/data_psplib/J30/J30_20_7"},
            {"test/rcpsp/data_psplib/J30/J30_20_8"}, {"test/rcpsp/data_psplib/J30/J30_20_9"}, {"test/rcpsp/data_psplib/J30/J30_20_10"},
            {"test/rcpsp/data_psplib/J30/J30_21_1"}, {"test/rcpsp/data_psplib/J30/J30_21_2"}, {"test/rcpsp/data_psplib/J30/J30_21_3"},
            {"test/rcpsp/data_psplib/J30/J30_21_4"}, {"test/rcpsp/data_psplib/J30/J30_21_5"}, {"test/rcpsp/data_psplib/J30/J30_21_6"},
            {"test/rcpsp/data_psplib/J30/J30_21_7"}, {"test/rcpsp/data_psplib/J30/J30_21_8"}, {"test/rcpsp/data_psplib/J30/J30_21_9"},
            {"test/rcpsp/data_psplib/J30/J30_21_10"}, {"test/rcpsp/data_psplib/J30/J30_22_1"}, {"test/rcpsp/data_psplib/J30/J30_22_2"},
            {"test/rcpsp/data_psplib/J30/J30_22_3"}, {"test/rcpsp/data_psplib/J30/J30_22_4"}, {"test/rcpsp/data_psplib/J30/J30_22_5"},
            {"test/rcpsp/data_psplib/J30/J30_22_6"}, {"test/rcpsp/data_psplib/J30/J30_22_7"}, {"test/rcpsp/data_psplib/J30/J30_22_8"},
            {"test/rcpsp/data_psplib/J30/J30_22_9"}, {"test/rcpsp/data_psplib/J30/J30_22_10"}, {"test/rcpsp/data_psplib/J30/J30_23_1"},
            {"test/rcpsp/data_psplib/J30/J30_23_2"}, {"test/rcpsp/data_psplib/J30/J30_23_4"}, {"test/rcpsp/data_psplib/J30/J30_23_5"},
            {"test/rcpsp/data_psplib/J30/J30_23_6"}, {"test/rcpsp/data_psplib/J30/J30_23_7"}, {"test/rcpsp/data_psplib/J30/J30_23_8"},
            {"test/rcpsp/data_psplib/J30/J30_23_9"}, {"test/rcpsp/data_psplib/J30/J30_23_10"}, {"test/rcpsp/data_psplib/J30/J30_24_1"},
            {"test/rcpsp/data_psplib/J30/J30_24_2"}, {"test/rcpsp/data_psplib/J30/J30_24_3"}, {"test/rcpsp/data_psplib/J30/J30_24_4"},
            {"test/rcpsp/data_psplib/J30/J30_24_5"}, {"test/rcpsp/data_psplib/J30/J30_24_6"}, {"test/rcpsp/data_psplib/J30/J30_24_7"},
            {"test/rcpsp/data_psplib/J30/J30_24_8"}, {"test/rcpsp/data_psplib/J30/J30_24_9"}, {"test/rcpsp/data_psplib/J30/J30_24_10"},
            {"test/rcpsp/data_psplib/J30/J30_25_1"}, {"test/rcpsp/data_psplib/J30/J30_25_2"}, {"test/rcpsp/data_psplib/J30/J30_25_3"},
            {"test/rcpsp/data_psplib/J30/J30_25_4"}, {"test/rcpsp/data_psplib/J30/J30_25_5"}, {"test/rcpsp/data_psplib/J30/J30_25_6"},
            {"test/rcpsp/data_psplib/J30/J30_25_7"}, {"test/rcpsp/data_psplib/J30/J30_25_8"}, {"test/rcpsp/data_psplib/J30/J30_25_9"},
            {"test/rcpsp/data_psplib/J30/J30_25_10"}, {"test/rcpsp/data_psplib/J30/J30_26_1"}, {"test/rcpsp/data_psplib/J30/J30_26_2"},
            {"test/rcpsp/data_psplib/J30/J30_26_3"}, {"test/rcpsp/data_psplib/J30/J30_26_4"}, {"test/rcpsp/data_psplib/J30/J30_26_5"},
            {"test/rcpsp/data_psplib/J30/J30_26_6"}, {"test/rcpsp/data_psplib/J30/J30_26_7"}, {"test/rcpsp/data_psplib/J30/J30_26_8"},
            {"test/rcpsp/data_psplib/J30/J30_26_9"}, {"test/rcpsp/data_psplib/J30/J30_26_10"}, {"test/rcpsp/data_psplib/J30/J30_27_1"},
            {"test/rcpsp/data_psplib/J30/J30_27_2"}, {"test/rcpsp/data_psplib/J30/J30_27_3"}, {"test/rcpsp/data_psplib/J30/J30_27_4"},
            {"test/rcpsp/data_psplib/J30/J30_27_5"}, {"test/rcpsp/data_psplib/J30/J30_27_6"}, {"test/rcpsp/data_psplib/J30/J30_28_6"},
            {"test/rcpsp/data_psplib/J30/J30_28_7"}, {"test/rcpsp/data_psplib/J30/J30_28_8"}, {"test/rcpsp/data_psplib/J30/J30_28_9"},
            {"test/rcpsp/data_psplib/J30/J30_28_10"}, {"test/rcpsp/data_psplib/J30/J30_29_1"}, {"test/rcpsp/data_psplib/J30/J30_29_2"},
            {"test/rcpsp/data_psplib/J30/J30_29_3"}, {"test/rcpsp/data_psplib/J30/J30_29_4"}, {"test/rcpsp/data_psplib/J30/J30_29_5"},
            {"test/rcpsp/data_psplib/J30/J30_29_6"}, {"test/rcpsp/data_psplib/J30/J30_29_7"}, {"test/rcpsp/data_psplib/J30/J30_29_8"},
            {"test/rcpsp/data_psplib/J30/J30_29_9"}, {"test/rcpsp/data_psplib/J30/J30_29_10"}, {"test/rcpsp/data_psplib/J30/J30_30_1"},
            {"test/rcpsp/data_psplib/J30/J30_30_2"}, {"test/rcpsp/data_psplib/J30/J30_30_3"}, {"test/rcpsp/data_psplib/J30/J30_30_4"},
            {"test/rcpsp/data_psplib/J30/J30_30_5"}, {"test/rcpsp/data_psplib/J30/J30_30_6"}, {"test/rcpsp/data_psplib/J30/J30_30_7"},
            {"test/rcpsp/data_psplib/J30/J30_30_8"}, {"test/rcpsp/data_psplib/J30/J30_30_9"}, {"test/rcpsp/data_psplib/J30/J30_30_10"},
            {"test/rcpsp/data_psplib/J30/J30_31_1"}, {"test/rcpsp/data_psplib/J30/J30_31_2"}, {"test/rcpsp/data_psplib/J30/J30_31_3"},
            {"test/rcpsp/data_psplib/J30/J30_31_4"}, {"test/rcpsp/data_psplib/J30/J30_31_5"}, {"test/rcpsp/data_psplib/J30/J30_31_6"},
            {"test/rcpsp/data_psplib/J30/J30_31_7"}, {"test/rcpsp/data_psplib/J30/J30_31_8"}, {"test/rcpsp/data_psplib/J30/J30_31_9"},
            {"test/rcpsp/data_psplib/J30/J30_31_10"}, {"test/rcpsp/data_psplib/J30/J30_32_1"}, {"test/rcpsp/data_psplib/J30/J30_32_2"},
            {"test/rcpsp/data_psplib/J30/J30_32_3"}, {"test/rcpsp/data_psplib/J30/J30_32_4"}, {"test/rcpsp/data_psplib/J30/J30_32_5"},
            {"test/rcpsp/data_psplib/J30/J30_32_6"}, {"test/rcpsp/data_psplib/J30/J30_32_7"}, {"test/rcpsp/data_psplib/J30/J30_32_8"},
            {"test/rcpsp/data_psplib/J30/J30_32_9"}, {"test/rcpsp/data_psplib/J30/J30_32_10"}, {"test/rcpsp/data_psplib/J30/J30_33_1"},
            {"test/rcpsp/data_psplib/J30/J30_33_2"}, {"test/rcpsp/data_psplib/J30/J30_33_3"}, {"test/rcpsp/data_psplib/J30/J30_33_4"},
            {"test/rcpsp/data_psplib/J30/J30_33_5"}, {"test/rcpsp/data_psplib/J30/J30_33_6"}, {"test/rcpsp/data_psplib/J30/J30_33_7"},
            {"test/rcpsp/data_psplib/J30/J30_33_8"}, {"test/rcpsp/data_psplib/J30/J30_33_9"}, {"test/rcpsp/data_psplib/J30/J30_33_10"},
            {"test/rcpsp/data_psplib/J30/J30_34_1"}, {"test/rcpsp/data_psplib/J30/J30_34_2"}, {"test/rcpsp/data_psplib/J30/J30_34_3"},
            {"test/rcpsp/data_psplib/J30/J30_34_4"}, {"test/rcpsp/data_psplib/J30/J30_34_5"}, {"test/rcpsp/data_psplib/J30/J30_34_6"},
            {"test/rcpsp/data_psplib/J30/J30_34_7"}, {"test/rcpsp/data_psplib/J30/J30_34_8"}, {"test/rcpsp/data_psplib/J30/J30_34_9"},
            {"test/rcpsp/data_psplib/J30/J30_34_10"}, {"test/rcpsp/data_psplib/J30/J30_35_1"}, {"test/rcpsp/data_psplib/J30/J30_35_2"},
            {"test/rcpsp/data_psplib/J30/J30_35_3"}, {"test/rcpsp/data_psplib/J30/J30_35_4"}, {"test/rcpsp/data_psplib/J30/J30_35_5"},
            {"test/rcpsp/data_psplib/J30/J30_35_6"}, {"test/rcpsp/data_psplib/J30/J30_35_7"}, {"test/rcpsp/data_psplib/J30/J30_35_8"},
            {"test/rcpsp/data_psplib/J30/J30_35_9"}, {"test/rcpsp/data_psplib/J30/J30_35_10"}, {"test/rcpsp/data_psplib/J30/J30_36_1"},
            {"test/rcpsp/data_psplib/J30/J30_36_2"}, {"test/rcpsp/data_psplib/J30/J30_36_3"}, {"test/rcpsp/data_psplib/J30/J30_36_4"},
            {"test/rcpsp/data_psplib/J30/J30_36_5"}, {"test/rcpsp/data_psplib/J30/J30_36_6"}, {"test/rcpsp/data_psplib/J30/J30_36_7"},
            {"test/rcpsp/data_psplib/J30/J30_36_8"}, {"test/rcpsp/data_psplib/J30/J30_36_9"}, {"test/rcpsp/data_psplib/J30/J30_36_10"},
            {"test/rcpsp/data_psplib/J30/J30_37_1"}, {"test/rcpsp/data_psplib/J30/J30_37_2"}, {"test/rcpsp/data_psplib/J30/J30_37_3"},
            {"test/rcpsp/data_psplib/J30/J30_37_4"}, {"test/rcpsp/data_psplib/J30/J30_37_5"}, {"test/rcpsp/data_psplib/J30/J30_37_6"},
            {"test/rcpsp/data_psplib/J30/J30_37_7"}, {"test/rcpsp/data_psplib/J30/J30_37_8"}, {"test/rcpsp/data_psplib/J30/J30_37_9"},
            {"test/rcpsp/data_psplib/J30/J30_37_10"}, {"test/rcpsp/data_psplib/J30/J30_38_1"}, {"test/rcpsp/data_psplib/J30/J30_38_2"},
            {"test/rcpsp/data_psplib/J30/J30_38_3"}, {"test/rcpsp/data_psplib/J30/J30_38_4"}, {"test/rcpsp/data_psplib/J30/J30_38_5"},
            {"test/rcpsp/data_psplib/J30/J30_38_6"}, {"test/rcpsp/data_psplib/J30/J30_38_7"}, {"test/rcpsp/data_psplib/J30/J30_38_8"},
            {"test/rcpsp/data_psplib/J30/J30_38_9"}, {"test/rcpsp/data_psplib/J30/J30_38_10"}, {"test/rcpsp/data_psplib/J30/J30_39_1"},
            {"test/rcpsp/data_psplib/J30/J30_39_2"}, {"test/rcpsp/data_psplib/J30/J30_39_3"}, {"test/rcpsp/data_psplib/J30/J30_39_4"},
            {"test/rcpsp/data_psplib/J30/J30_39_5"}, {"test/rcpsp/data_psplib/J30/J30_39_6"}, {"test/rcpsp/data_psplib/J30/J30_39_7"},
            {"test/rcpsp/data_psplib/J30/J30_39_8"}, {"test/rcpsp/data_psplib/J30/J30_39_9"}, {"test/rcpsp/data_psplib/J30/J30_39_10"},
            {"test/rcpsp/data_psplib/J30/J30_40_1"}, {"test/rcpsp/data_psplib/J30/J30_40_2"}, {"test/rcpsp/data_psplib/J30/J30_40_3"},
            {"test/rcpsp/data_psplib/J30/J30_40_4"}, {"test/rcpsp/data_psplib/J30/J30_40_5"}, {"test/rcpsp/data_psplib/J30/J30_40_6"},
            {"test/rcpsp/data_psplib/J30/J30_40_7"}, {"test/rcpsp/data_psplib/J30/J30_40_8"}, {"test/rcpsp/data_psplib/J30/J30_40_9"},
            {"test/rcpsp/data_psplib/J30/J30_40_10"}, {"test/rcpsp/data_psplib/J30/J30_41_1"}, {"test/rcpsp/data_psplib/J30/J30_41_2"},
            {"test/rcpsp/data_psplib/J30/J30_41_3"}, {"test/rcpsp/data_psplib/J30/J30_41_4"}, {"test/rcpsp/data_psplib/J30/J30_41_5"},
            {"test/rcpsp/data_psplib/J30/J30_41_6"}, {"test/rcpsp/data_psplib/J30/J30_41_7"}, {"test/rcpsp/data_psplib/J30/J30_41_8"},
            {"test/rcpsp/data_psplib/J30/J30_41_9"}, {"test/rcpsp/data_psplib/J30/J30_41_10"}, {"test/rcpsp/data_psplib/J30/J30_42_1"},
            {"test/rcpsp/data_psplib/J30/J30_42_2"}, {"test/rcpsp/data_psplib/J30/J30_42_3"}, {"test/rcpsp/data_psplib/J30/J30_42_4"},
            {"test/rcpsp/data_psplib/J30/J30_42_5"}, {"test/rcpsp/data_psplib/J30/J30_42_6"}, {"test/rcpsp/data_psplib/J30/J30_42_7"},
            {"test/rcpsp/data_psplib/J30/J30_42_8"}, {"test/rcpsp/data_psplib/J30/J30_42_9"}, {"test/rcpsp/data_psplib/J30/J30_42_10"},
            {"test/rcpsp/data_psplib/J30/J30_43_1"}, {"test/rcpsp/data_psplib/J30/J30_43_2"}, {"test/rcpsp/data_psplib/J30/J30_43_3"},
            {"test/rcpsp/data_psplib/J30/J30_43_4"}, {"test/rcpsp/data_psplib/J30/J30_43_5"}, {"test/rcpsp/data_psplib/J30/J30_43_6"},
            {"test/rcpsp/data_psplib/J30/J30_43_7"}, {"test/rcpsp/data_psplib/J30/J30_43_8"}, {"test/rcpsp/data_psplib/J30/J30_43_9"},
            {"test/rcpsp/data_psplib/J30/J30_43_10"}, {"test/rcpsp/data_psplib/J30/J30_44_1"}, {"test/rcpsp/data_psplib/J30/J30_44_2"},
            {"test/rcpsp/data_psplib/J30/J30_44_3"}, {"test/rcpsp/data_psplib/J30/J30_44_4"}, {"test/rcpsp/data_psplib/J30/J30_44_5"},
            {"test/rcpsp/data_psplib/J30/J30_44_6"}, {"test/rcpsp/data_psplib/J30/J30_44_7"}, {"test/rcpsp/data_psplib/J30/J30_44_8"},
            {"test/rcpsp/data_psplib/J30/J30_44_9"}, {"test/rcpsp/data_psplib/J30/J30_44_10"}, {"test/rcpsp/data_psplib/J30/J30_45_1"},
            {"test/rcpsp/data_psplib/J30/J30_45_2"}, {"test/rcpsp/data_psplib/J30/J30_45_3"}, {"test/rcpsp/data_psplib/J30/J30_45_4"},
            {"test/rcpsp/data_psplib/J30/J30_45_5"}, {"test/rcpsp/data_psplib/J30/J30_45_6"}, {"test/rcpsp/data_psplib/J30/J30_45_7"},
            {"test/rcpsp/data_psplib/J30/J30_45_8"}, {"test/rcpsp/data_psplib/J30/J30_45_9"}, {"test/rcpsp/data_psplib/J30/J30_45_10"},
            {"test/rcpsp/data_psplib/J30/J30_46_1"}, {"test/rcpsp/data_psplib/J30/J30_46_2"}, {"test/rcpsp/data_psplib/J30/J30_46_3"},
            {"test/rcpsp/data_psplib/J30/J30_46_4"}, {"test/rcpsp/data_psplib/J30/J30_46_5"}, {"test/rcpsp/data_psplib/J30/J30_46_6"},
            {"test/rcpsp/data_psplib/J30/J30_46_7"}, {"test/rcpsp/data_psplib/J30/J30_46_8"}, {"test/rcpsp/data_psplib/J30/J30_46_9"},
            {"test/rcpsp/data_psplib/J30/J30_46_10"}, {"test/rcpsp/data_psplib/J30/J30_47_1"}, {"test/rcpsp/data_psplib/J30/J30_47_2"},
            {"test/rcpsp/data_psplib/J30/J30_47_3"}, {"test/rcpsp/data_psplib/J30/J30_47_4"}, {"test/rcpsp/data_psplib/J30/J30_47_5"},
            {"test/rcpsp/data_psplib/J30/J30_47_6"}, {"test/rcpsp/data_psplib/J30/J30_47_7"}, {"test/rcpsp/data_psplib/J30/J30_47_8"},
            {"test/rcpsp/data_psplib/J30/J30_47_9"}, {"test/rcpsp/data_psplib/J30/J30_47_10"}, {"test/rcpsp/data_psplib/J30/J30_48_1"},
            {"test/rcpsp/data_psplib/J30/J30_48_2"}, {"test/rcpsp/data_psplib/J30/J30_48_3"}, {"test/rcpsp/data_psplib/J30/J30_48_4"},
            {"test/rcpsp/data_psplib/J30/J30_48_5"}, {"test/rcpsp/data_psplib/J30/J30_48_6"}, {"test/rcpsp/data_psplib/J30/J30_48_7"},
            {"test/rcpsp/data_psplib/J30/J30_48_8"}, {"test/rcpsp/data_psplib/J30/J30_48_9"}, {"test/rcpsp/data_psplib/J30/J30_48_10"},

            //J60
            {"test/rcpsp/data_psplib/J60/J60_10_1"}, {"test/rcpsp/data_psplib/J60/J60_10_2"}, {"test/rcpsp/data_psplib/J60/J60_10_3"},
            {"test/rcpsp/data_psplib/J60/J60_10_4"}, {"test/rcpsp/data_psplib/J60/J60_10_5"}, {"test/rcpsp/data_psplib/J60/J60_10_6"},
            {"test/rcpsp/data_psplib/J60/J60_10_7"}, {"test/rcpsp/data_psplib/J60/J60_10_8"}, {"test/rcpsp/data_psplib/J60/J60_10_9"},
            {"test/rcpsp/data_psplib/J60/J60_10_10"}, {"test/rcpsp/data_psplib/J60/J60_11_1"}, {"test/rcpsp/data_psplib/J60/J60_11_2"},
            {"test/rcpsp/data_psplib/J60/J60_11_3"}, {"test/rcpsp/data_psplib/J60/J60_11_4"}, {"test/rcpsp/data_psplib/J60/J60_11_5"},
            {"test/rcpsp/data_psplib/J60/J60_11_6"}, {"test/rcpsp/data_psplib/J60/J60_11_7"}, {"test/rcpsp/data_psplib/J60/J60_11_8"},
            {"test/rcpsp/data_psplib/J60/J60_11_9"}, {"test/rcpsp/data_psplib/J60/J60_11_10"}, {"test/rcpsp/data_psplib/J60/J60_12_1"},
            {"test/rcpsp/data_psplib/J60/J60_12_2"}, {"test/rcpsp/data_psplib/J60/J60_12_3"}, {"test/rcpsp/data_psplib/J60/J60_12_4"},
            {"test/rcpsp/data_psplib/J60/J60_12_5"}, {"test/rcpsp/data_psplib/J60/J60_12_6"}, {"test/rcpsp/data_psplib/J60/J60_12_7"},
            {"test/rcpsp/data_psplib/J60/J60_12_8"}, {"test/rcpsp/data_psplib/J60/J60_12_9"}, {"test/rcpsp/data_psplib/J60/J60_12_10"},
            {"test/rcpsp/data_psplib/J60/J60_13_1"}, {"test/rcpsp/data_psplib/J60/J60_13_2"}, {"test/rcpsp/data_psplib/J60/J60_13_3"},
            {"test/rcpsp/data_psplib/J60/J60_13_4"}, {"test/rcpsp/data_psplib/J60/J60_13_5"}, {"test/rcpsp/data_psplib/J60/J60_13_6"},
            {"test/rcpsp/data_psplib/J60/J60_13_7"}, {"test/rcpsp/data_psplib/J60/J60_13_8"}, {"test/rcpsp/data_psplib/J60/J60_13_9"},
            {"test/rcpsp/data_psplib/J60/J60_13_10"}, {"test/rcpsp/data_psplib/J60/J60_14_1"}, {"test/rcpsp/data_psplib/J60/J60_14_2"},
            {"test/rcpsp/data_psplib/J60/J60_14_3"}, {"test/rcpsp/data_psplib/J60/J60_14_4"}, {"test/rcpsp/data_psplib/J60/J60_14_5"},
            {"test/rcpsp/data_psplib/J60/J60_14_6"}, {"test/rcpsp/data_psplib/J60/J60_14_7"}, {"test/rcpsp/data_psplib/J60/J60_14_8"},
            {"test/rcpsp/data_psplib/J60/J60_14_9"}, {"test/rcpsp/data_psplib/J60/J60_14_10"}, {"test/rcpsp/data_psplib/J60/J60_15_1"},
            {"test/rcpsp/data_psplib/J60/J60_15_2"}, {"test/rcpsp/data_psplib/J60/J60_15_3"}, {"test/rcpsp/data_psplib/J60/J60_15_4"},
            {"test/rcpsp/data_psplib/J60/J60_15_5"}, {"test/rcpsp/data_psplib/J60/J60_15_6"}, {"test/rcpsp/data_psplib/J60/J60_15_7"},
            {"test/rcpsp/data_psplib/J60/J60_15_8"}, {"test/rcpsp/data_psplib/J60/J60_15_9"}, {"test/rcpsp/data_psplib/J60/J60_15_10"},
            {"test/rcpsp/data_psplib/J60/J60_16_1"}, {"test/rcpsp/data_psplib/J60/J60_16_2"}, {"test/rcpsp/data_psplib/J60/J60_16_3"},
            {"test/rcpsp/data_psplib/J60/J60_16_4"}, {"test/rcpsp/data_psplib/J60/J60_16_5"}, {"test/rcpsp/data_psplib/J60/J60_16_6"},
            {"test/rcpsp/data_psplib/J60/J60_16_7"}, {"test/rcpsp/data_psplib/J60/J60_16_8"}, {"test/rcpsp/data_psplib/J60/J60_16_9"},
            {"test/rcpsp/data_psplib/J60/J60_16_10"}, {"test/rcpsp/data_psplib/J60/J60_17_1"}, {"test/rcpsp/data_psplib/J60/J60_17_2"},
            {"test/rcpsp/data_psplib/J60/J60_17_3"}, {"test/rcpsp/data_psplib/J60/J60_17_4"}, {"test/rcpsp/data_psplib/J60/J60_17_5"},
            {"test/rcpsp/data_psplib/J60/J60_17_6"}, {"test/rcpsp/data_psplib/J60/J60_17_7"}, {"test/rcpsp/data_psplib/J60/J60_17_8"},
            {"test/rcpsp/data_psplib/J60/J60_17_9"}, {"test/rcpsp/data_psplib/J60/J60_17_10"}, {"test/rcpsp/data_psplib/J60/J60_18_1"},
            {"test/rcpsp/data_psplib/J60/J60_18_2"}, {"test/rcpsp/data_psplib/J60/J60_18_3"}, {"test/rcpsp/data_psplib/J60/J60_18_4"},
            {"test/rcpsp/data_psplib/J60/J60_18_5"}, {"test/rcpsp/data_psplib/J60/J60_18_6"}, {"test/rcpsp/data_psplib/J60/J60_18_7"},
            {"test/rcpsp/data_psplib/J60/J60_18_8"}, {"test/rcpsp/data_psplib/J60/J60_18_9"}, {"test/rcpsp/data_psplib/J60/J60_18_10"},
            {"test/rcpsp/data_psplib/J60/J60_19_1"}, {"test/rcpsp/data_psplib/J60/J60_19_2"}, {"test/rcpsp/data_psplib/J60/J60_19_3"},
            {"test/rcpsp/data_psplib/J60/J60_19_4"}, {"test/rcpsp/data_psplib/J60/J60_19_5"}, {"test/rcpsp/data_psplib/J60/J60_19_6"},
            {"test/rcpsp/data_psplib/J60/J60_19_7"}, {"test/rcpsp/data_psplib/J60/J60_19_8"}, {"test/rcpsp/data_psplib/J60/J60_19_9"},
            {"test/rcpsp/data_psplib/J60/J60_19_10"}, {"test/rcpsp/data_psplib/J60/J60_20_1"}, {"test/rcpsp/data_psplib/J60/J60_20_2"},
            {"test/rcpsp/data_psplib/J60/J60_20_3"}, {"test/rcpsp/data_psplib/J60/J60_20_4"}, {"test/rcpsp/data_psplib/J60/J60_20_5"},
            {"test/rcpsp/data_psplib/J60/J60_20_6"}, {"test/rcpsp/data_psplib/J60/J60_20_7"}, {"test/rcpsp/data_psplib/J60/J60_20_8"},
            {"test/rcpsp/data_psplib/J60/J60_20_9"}, {"test/rcpsp/data_psplib/J60/J60_20_10"}, {"test/rcpsp/data_psplib/J60/J60_21_1"},
            {"test/rcpsp/data_psplib/J60/J60_21_2"}, {"test/rcpsp/data_psplib/J60/J60_21_3"}, {"test/rcpsp/data_psplib/J60/J60_21_4"},
            {"test/rcpsp/data_psplib/J60/J60_21_5"}, {"test/rcpsp/data_psplib/J60/J60_21_6"}, {"test/rcpsp/data_psplib/J60/J60_21_7"},
            {"test/rcpsp/data_psplib/J60/J60_21_8"}, {"test/rcpsp/data_psplib/J60/J60_21_9"}, {"test/rcpsp/data_psplib/J60/J60_21_10"},
            {"test/rcpsp/data_psplib/J60/J60_22_1"}, {"test/rcpsp/data_psplib/J60/J60_22_2"}, {"test/rcpsp/data_psplib/J60/J60_22_3"},
            {"test/rcpsp/data_psplib/J60/J60_22_4"}, {"test/rcpsp/data_psplib/J60/J60_22_5"}, {"test/rcpsp/data_psplib/J60/J60_22_6"},
            {"test/rcpsp/data_psplib/J60/J60_22_7"}, {"test/rcpsp/data_psplib/J60/J60_22_8"}, {"test/rcpsp/data_psplib/J60/J60_22_9"},
            {"test/rcpsp/data_psplib/J60/J60_22_10"}, {"test/rcpsp/data_psplib/J60/J60_23_1"}, {"test/rcpsp/data_psplib/J60/J60_23_2"},
            {"test/rcpsp/data_psplib/J60/J60_23_3"}, {"test/rcpsp/data_psplib/J60/J60_23_4"}, {"test/rcpsp/data_psplib/J60/J60_23_5"},
            {"test/rcpsp/data_psplib/J60/J60_23_6"}, {"test/rcpsp/data_psplib/J60/J60_23_7"}, {"test/rcpsp/data_psplib/J60/J60_23_8"},
            {"test/rcpsp/data_psplib/J60/J60_23_9"}, {"test/rcpsp/data_psplib/J60/J60_23_10"}, {"test/rcpsp/data_psplib/J60/J60_24_1"},
            {"test/rcpsp/data_psplib/J60/J60_24_2"}, {"test/rcpsp/data_psplib/J60/J60_24_3"}, {"test/rcpsp/data_psplib/J60/J60_24_4"},
            {"test/rcpsp/data_psplib/J60/J60_24_5"}, {"test/rcpsp/data_psplib/J60/J60_24_6"}, {"test/rcpsp/data_psplib/J60/J60_24_7"},
            {"test/rcpsp/data_psplib/J60/J60_24_8"}, {"test/rcpsp/data_psplib/J60/J60_24_9"}, {"test/rcpsp/data_psplib/J60/J60_24_10"},
            {"test/rcpsp/data_psplib/J60/J60_25_1"}, {"test/rcpsp/data_psplib/J60/J60_25_2"}, {"test/rcpsp/data_psplib/J60/J60_25_3"},
            {"test/rcpsp/data_psplib/J60/J60_25_4"}, {"test/rcpsp/data_psplib/J60/J60_25_5"}, {"test/rcpsp/data_psplib/J60/J60_25_6"},
            {"test/rcpsp/data_psplib/J60/J60_25_7"}, {"test/rcpsp/data_psplib/J60/J60_25_8"}, {"test/rcpsp/data_psplib/J60/J60_25_9"},
            {"test/rcpsp/data_psplib/J60/J60_25_10"}, {"test/rcpsp/data_psplib/J60/J60_26_1"}, {"test/rcpsp/data_psplib/J60/J60_26_2"},
            {"test/rcpsp/data_psplib/J60/J60_26_3"}, {"test/rcpsp/data_psplib/J60/J60_26_4"}, {"test/rcpsp/data_psplib/J60/J60_26_5"},
            {"test/rcpsp/data_psplib/J60/J60_26_6"}, {"test/rcpsp/data_psplib/J60/J60_26_7"}, {"test/rcpsp/data_psplib/J60/J60_26_8"},
            {"test/rcpsp/data_psplib/J60/J60_26_9"}, {"test/rcpsp/data_psplib/J60/J60_26_10"}, {"test/rcpsp/data_psplib/J60/J60_27_1"},
            {"test/rcpsp/data_psplib/J60/J60_27_2"}, {"test/rcpsp/data_psplib/J60/J60_27_3"}, {"test/rcpsp/data_psplib/J60/J60_27_4"},
            {"test/rcpsp/data_psplib/J60/J60_27_5"}, {"test/rcpsp/data_psplib/J60/J60_27_6"}, {"test/rcpsp/data_psplib/J60/J60_27_7"},
            {"test/rcpsp/data_psplib/J60/J60_27_8"}, {"test/rcpsp/data_psplib/J60/J60_27_9"}, {"test/rcpsp/data_psplib/J60/J60_27_10"},
            {"test/rcpsp/data_psplib/J60/J60_28_1"}, {"test/rcpsp/data_psplib/J60/J60_28_2"}, {"test/rcpsp/data_psplib/J60/J60_28_3"},
            {"test/rcpsp/data_psplib/J60/J60_28_4"}, {"test/rcpsp/data_psplib/J60/J60_28_5"}, {"test/rcpsp/data_psplib/J60/J60_28_6"},
            {"test/rcpsp/data_psplib/J60/J60_28_7"}, {"test/rcpsp/data_psplib/J60/J60_28_8"}, {"test/rcpsp/data_psplib/J60/J60_28_9"},
            {"test/rcpsp/data_psplib/J60/J60_28_10"}, {"test/rcpsp/data_psplib/J60/J60_29_1"}, {"test/rcpsp/data_psplib/J60/J60_29_2"},
            {"test/rcpsp/data_psplib/J60/J60_29_3"}, {"test/rcpsp/data_psplib/J60/J60_29_4"}, {"test/rcpsp/data_psplib/J60/J60_29_5"},
            {"test/rcpsp/data_psplib/J60/J60_29_6"}, {"test/rcpsp/data_psplib/J60/J60_29_7"}, {"test/rcpsp/data_psplib/J60/J60_29_8"},
            {"test/rcpsp/data_psplib/J60/J60_29_9"}, {"test/rcpsp/data_psplib/J60/J60_29_10"}, {"test/rcpsp/data_psplib/J60/J60_30_1"},
            {"test/rcpsp/data_psplib/J60/J60_30_2"}, {"test/rcpsp/data_psplib/J60/J60_30_3"}, {"test/rcpsp/data_psplib/J60/J60_30_4"},
            {"test/rcpsp/data_psplib/J60/J60_30_5"}, {"test/rcpsp/data_psplib/J60/J60_30_6"}, {"test/rcpsp/data_psplib/J60/J60_30_7"},
            {"test/rcpsp/data_psplib/J60/J60_30_8"}, {"test/rcpsp/data_psplib/J60/J60_30_9"}, {"test/rcpsp/data_psplib/J60/J60_30_10"},
            {"test/rcpsp/data_psplib/J60/J60_31_1"}, {"test/rcpsp/data_psplib/J60/J60_32_1"}, {"test/rcpsp/data_psplib/J60/J60_32_2"},
            {"test/rcpsp/data_psplib/J60/J60_32_3"}, {"test/rcpsp/data_psplib/J60/J60_32_4"}, {"test/rcpsp/data_psplib/J60/J60_32_5"},
            {"test/rcpsp/data_psplib/J60/J60_32_6"}, {"test/rcpsp/data_psplib/J60/J60_32_7"}, {"test/rcpsp/data_psplib/J60/J60_32_8"},
            {"test/rcpsp/data_psplib/J60/J60_32_9"}, {"test/rcpsp/data_psplib/J60/J60_32_10"}, {"test/rcpsp/data_psplib/J60/J60_33_1"},
            {"test/rcpsp/data_psplib/J60/J60_33_2"}, {"test/rcpsp/data_psplib/J60/J60_33_3"}, {"test/rcpsp/data_psplib/J60/J60_33_4"},
            {"test/rcpsp/data_psplib/J60/J60_33_5"}, {"test/rcpsp/data_psplib/J60/J60_33_6"}, {"test/rcpsp/data_psplib/J60/J60_33_7"},
            {"test/rcpsp/data_psplib/J60/J60_33_8"}, {"test/rcpsp/data_psplib/J60/J60_33_9"}, {"test/rcpsp/data_psplib/J60/J60_33_10"},
            {"test/rcpsp/data_psplib/J60/J60_34_1"}, {"test/rcpsp/data_psplib/J60/J60_34_2"}, {"test/rcpsp/data_psplib/J60/J60_34_3"},
            {"test/rcpsp/data_psplib/J60/J60_34_4"}, {"test/rcpsp/data_psplib/J60/J60_34_5"}, {"test/rcpsp/data_psplib/J60/J60_34_6"},
            {"test/rcpsp/data_psplib/J60/J60_34_7"}, {"test/rcpsp/data_psplib/J60/J60_34_8"}, {"test/rcpsp/data_psplib/J60/J60_34_9"},
            {"test/rcpsp/data_psplib/J60/J60_34_10"},
                /*

               //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
               //{"above1hour/amaze/2012-04-30"},
               //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
               //{"above1hour/amaze/2012-05-02"},
               //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
               //{"above1hour/amaze/2012-05-03"},
               //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
               //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
               //{"above1hour/amaze/2012-05-15"},
               //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
               //{"above1hour/amaze/2012-05-31"},
               //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
               //{"above1hour/amaze/2012-06-01"},
               //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
               //{"above1hour/amaze/2012-06-07"},
               //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
               //{"above1hour/amaze/2012-06-26"},
               //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
               //{"above1hour/amaze/2012-06-27"},
               //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
               //{"above1hour/amaze/2012-06-28"},


               //largescheduling
               //%% Stack overflow exception error;
               {"largescheduling/instance-0100-1"},

               // %% Stack overflow exception error; consider option -Xss... for JVM
               {"largescheduling/instance-0400-2"},

               //%% Stack overflow exception error; consider option -Xss... for JVM
               {"largescheduling/instance-0800-1"},

               //%% Stack overflow exception error; consider option -Xss... for JVM
               {"largescheduling/instance-1600-2"},

               //java.lang.AssertionError: non-optimal arcs:
               {"mapping/mesh3x3_mpeg_2"},

               //java.lang.AssertionError: non-optimal arcs:
               {"mapping/ring_2.dzn"},


               //java.lang.IndexOutOfBoundsException
               {"radiation/i14-9"},

               //triangular
               //%% Parser exception
               {"/triangular/n10"},

               //%% Parser exception
               {"triangular/n16"},

               //%% Parser exception
               {"triangular/n22"},

               //%% Parser exception
               {"triangular/n28"},

               //%%Parser exception
               {"triangular/n37"},

               //225_divisor
               //java.lang.NumberFormatException: For input string: "-10000000000"
               //java.lang.NumberFormatException: For input string: "-10000000000"
               {"225_divisor/225_divisor"}

               ////arrow
               //%%java.lang.ArithmeticException: Too large bounds on intervals 123456789..987654321
               {"arrow/arrow"},

               //artificial_intelligence
               //java.lang.NumberFormatException: For input string: "11000098990"
               {"/artificial_intelligence/artificial_intelligence"},

               //birthdays_coins
               //%%java.lang.ArithmeticException: Overflow occurred from int -2100000000 + -300000000
               {"/birthdays_coins/birthdays_coins"},

               //birthdays_coins
               //%%java.lang.ArithmeticException: Overflow occurred from int -2100000000 + -300000000
               {"/birthdays_coins/birthdays_coins"},

               //blending
               //java.lang.AssertionError: Request for a value of not grounded variable z::{733.0373723874923..733.0375161858722}
               {"/blending/blending"},

               //candies
               //%%java.lang.ArithmeticException: Too large bounds on intervals 1233..123300000
               {"/candies/candies"},

               //225_divisor
               //java.lang.NumberFormatException: For input string: "-10000000000"
               {"/225_divisor/225_divisor"},

               //arrow
               //%%java.lang.ArithmeticException: Too large bounds on intervals 123456789..987654321
               {"/arrow/arrow"},

               //artificial_intelligence
               //java.lang.NumberFormatException: For input string: "11000098990"
               {"/artificial_intelligence/artificial_intelligence"},

               //euler_2
               //%%java.lang.ArithmeticException: Overflow occurred from int -2100000000 + -50000000
               {"/euler_2/euler_2"},

               //digits_of_the_square
               //%%java.lang.ArithmeticException: Too large bounds on intervals 1000000..99980001
               {"/digits_of_the_square/digits_of_the_square"},

               //birthdays_coins
               //%% Evaluation of model resulted in an overflow.
               //%%java.lang.ArithmeticException: Overflow occurred from int -2100000000 + -300000000
               {"birthdays_coins/birthdays_coins"},

               //blending
               //java.lang.AssertionError: Request for a value of not grounded variable z::{733.0373723874923..733.0375161858722}
               {"blending/blending"},

               //seating_arrangements_1
               //java.lang.AssertionError
               {"seating_arrangements/seating_arrangements_1"},

               //java.lang.AssertionError
               {"seating_arrangements/seating_arrangements_2"},

               //candies
               //%%java.lang.ArithmeticException: Too large bounds on intervals 1233..123300000
               {"candies/candies"},

               //coins
               //%%java.lang.ArithmeticException: Overflow occurred from int -1550000000 + -850000000
               {"coins/coins"},

               //contains_array
               //%%java.lang.ArithmeticException: Too large bounds on intervals 123402345..123402345
               {"/contains_array/contains_array"},

               //cookie_bake_off2
               //java.lang.AssertionError: Request for a value of not grounded variable diffs_sum::{148.8608479334477..148.88394192594498}
               {"/cookie_bake_off2/cookie_bake_off2"},

               //crypt_reversed
               //%%java.lang.ArithmeticException: Too large bounds on intervals 100000000..999999999
               {"/crypt_reversed/crypt_reversed"},

               //cur_num
               //%%java.lang.ArithmeticException: Overflow occurred from int 4000000 * 4000000
               {"/cur_num/cur_num"},

               //curious_set_of_integers
               //%%java.lang.ArithmeticException: Too large bounds on intervals 0..100000000
               {"/curious_set_of_integers/curious_set_of_integers"},

               //curve_fitting1
               //java.lang.AssertionError: Request for a value of not grounded variable z::{13.794108116596847..13.794376106502922}
               {"/curve_fitting1/curve_fitting1"},

               //dea
               //java.lang.AssertionError: Request for a value of not grounded variable X_INTRODUCED_4831::{3.4169921874999964..3.4212036132812536}
               {"/dea/dea"},

               //debruijn2d_2
               //%%java.lang.ArithmeticException: Too large bounds on intervals 0..387420488
               {"/debruijn2d_2/debruijn2d_2"}

               //diet1
               //%%java.lang.ArithmeticException: Overflow occurred from int -33333331 * -400
               {"/diet1/diet1"},

               //divisible_by_1_to_9
               //%%java.lang.ArithmeticException: Too large bounds on intervals 0..99999999
               {"/divisible_by_1_to_9/divisible_by_1_to_9"},

               //divisible_by_9_through_1
               //%%java.lang.ArithmeticException: Too large bounds on intervals 111111111..999999999
               {"/divisible_by_9_through_1/divisible_by_9_through_1"},

               //dynamical_optimization1
               //java.lang.AssertionError: Request for a value of not grounded variable cost::{36.886716755850856..36.89073504844621}
               {"/dynamical_optimization1/dynamical_optimization1"},

               //enigma_1557
               //%% Stack overflow exception error; consider option -Xss... for JVM
               //{"/enigma_1557/enigma_1557"},

               //enigma_1570
               //%%java.lang.ArithmeticException: Too large bounds on intervals 0..129847036
               //%% Evaluation of model resulted in an overflow.
               {"/enigma_1570/enigma_1570"}

               //enigma_1574
               //%%	java.lang.ArithmeticException: Overflow occurred from int 50000000 * 50000000
               {"/enigma_1574/enigma_1574"},

               //enigma_1575
               //java.lang.AssertionError: Operation mod does not hold w = 1 mod _1 = 3 = _9 = 0(result 0..1
               {"/enigma_1575/enigma_1575"},

               //enigma_portuguese_squares
               //%%java.lang.ArithmeticException: Too large bounds on intervals 1..1000000000
               {"/enigma_portuguese_squares/enigma_portuguese_squares"},

               //euler_52
               //%%java.lang.ArithmeticException: Too large bounds on intervals 1..999999999
               {"/euler_52/euler_52"},

               //food
               //%% Stack overflow exception error; consider option -Xss... for JVM
               {"/food/food"},

               //ice_cream
               //%%	java.lang.ArithmeticException: Overflow occurred from int 50000000 * 50
               {"/ice_cream/ice_cream"},

               //four_power
               //%%	java.lang.ArithmeticException: Too large bounds on intervals 1..64000000
               {"/four_power/four_power"},

               //furniture
               //%%	java.lang.ArithmeticException: Too large bounds on intervals 0..130186980
               {"furniture/furniture"},

               //grocery
               //%%java.lang.ArithmeticException: Too large bounds on intervals 0..359425431
               //%% Evaluation of model resulted in an overflow.
               {"/grocery/grocery"},

               //hardy_1729
               //%%	java.lang.ArithmeticException: Overflow occurred from int 50000000 * 50000000
               //%% Evaluation of model resulted in an overflow.
               {"/hardy_1729/hardy_1729"},

               //home_improvement
               //%% Stack overflow exception error; consider option -Xss... for JVM
               {"/home_improvement/home_improvement"},

               //knapsack_rosetta_code_unbounded_int
               //%%	java.lang.ArithmeticException: Overflow occurred from int 50000000 * 3000
               {"knapsack_rosetta_code_unbounded_int/knapsack_rosetta_code_unbounded_int"},

               //missing_digit
               //%%java.lang.ArithmeticException: Too high or low value for domain assignment int_lin_eq([-100000000, -10000000, -1000000, -100000, -10000, -1000, -100, -10, -1], [X_INTRODUCED_0::{0..9}, X_INTRODUCED_1::{0..9}, X_INTRODUCED_2::{0..9}, X_INTRODUCED_3::{0..9}, X_INTRODUCED_4::{0..9}, X_INTRODUCED_5::{0..9}, X_INTRODUCED_6::{0..9}, X_INTRODUCED_7::{0..9}, X_INTRODUCED_8::{0..9}], -536870912)
               //{"missing_digit/missing_digit"},

               //money_change
               //%%java.lang.ArithmeticException: Overflow occurred from int -50000000 * 50
               {"money_change/money_change"},

               //number_puzzle
               //%% Stack overflow exception error; consider option -Xss... for JVM
               {"number_puzzle/number_puzzle"},

               //number_square
               //%%java.lang.ArithmeticException: Too large bounds on intervals 110000000..199999999
               {"number_square/number_square"},

               //java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
               {"numberlink/numberlink6"},

               //%% Stack overflow exception error; consider option -Xss... for JVM
               {"scheduling_with_assignments/scheduling_with_assignments16c"},

               //%% Stack overflow exception error; consider option -Xss... for JVM
               {"scheduling_with_assignments/scheduling_with_assignments16e" },

               //%% Stack overflow exception error; consider option -Xss... for JVM
               {"scheduling_with_assignments/scheduling_with_assignments16f"},

               //coins
               //%%java.lang.ArithmeticException: Overflow occurred from int -1550000000 + -850000000 //
               {"coins/coins"},

               //nonlin2
               //%%java.lang.ArithmeticException: Overflow occurred from int 50000000 * 50000000
               {"nonlin2/nonlin2"},

               //pandigital_numbers
               //%	java.lang.ArithmeticException: Overflow occurred from int 99996 * 99997
               {"pandigital_numbers/pandigital_numbers"},

               //plan
               //java.lang.AssertionError: Request for a value of not grounded variable value::{361.7445664788383..361.7446692706953}
               {"plan//plan"},

               //product_configuration
               //%%	java.lang.ArithmeticException: Overflow occurred from int -50000000 * 50
               {"product_configuration/product_configuration"},

               //public_school_problem
               //%%	java.lang.ArithmeticException: Overflow occurred from int -1900000000 + -650000000
               {"public_school_problem/public_school_problem"},

               //pythagoras"},
               //%%	java.lang.ArithmeticException: Overflow occurred from int 49999999 * 49999999
               {"pythagoras/pythagoras"},

               //rosenbrock
               //java.lang.AssertionError: Request for a value of not grounded variable z::{403.9173340146463..404.0000000000004}
               {"rosenbrock/rosenbrock"},

               //seating_arrangements
               //java.lang.AssertionError
               {"seating_arrangements/seating_arrangements_1"},

               //java.lang.AssertionError
               {"seating_arrangements/seating_arrangements_21"},

               //seven11
               //%%java.lang.ArithmeticException: Too large bounds on intervals 0..359425431
               //%% Evaluation of model resulted in an overflow.
               {"seven11/seven11"},

               //transportation
               //%% Evaluation of model resulted in an overflow.
               //transportation/transportation"},
               //%%java.lang.ArithmeticException: Overflow occurred from int -2050000000 + -250000000
               {"transportation/transportation"},

               //transportation2
               //%%java.lang.ArithmeticException: Overflow occurred from int 1950000000 + 250000000
               //%% Evaluation of model resulted in an overflow.
               {"transportation2/transportation2"},

               //volsay2
               //java.lang.AssertionError: Request for a value of not grounded variable -z::{-7.152557373046877E-4..-0.0}
               {"volsay2/volsay2"},

               //smallest_winning_electoral2
               // %%java.lang.ArithmeticException: Too large bounds on intervals 0..311591917
               //%% Evaluation of model resulted in an overflow.
               {"smallest_winning_electoral2/smallest_winning_electoral2"},

               //square_root_of_wonderful
               //%% Evaluation of model resulted in an overflow.
               //%%java.lang.ArithmeticException: Too large bounds on intervals 111111111..999999999
               {"square_root_of_wonderful/square_root_of_wonderful"},

               //subset_sum
               //%%java.lang.ArithmeticException: Overflow occurred from int -1650000000 + -1150000000
               //%% Evaluation of model resulted in an overflow.
               {"subset_sum/subset_sum"},

               //tea_mixing
               //%% Evaluation of model resulted in an overflow.
               {"tea_mixing/tea_mixing"},}",

               //%%java.lang.ArithmeticException: Overflow occurred from int -1500000000 + -1350000000
               {"tea_mixing/tea_mixing"},

               //to_num
               //java.lang.NumberFormatException: For input string: "9999999999"
               {"to_num/to_num"},

               //tobacco
               //%% Evaluation of model resulted in an overflow.
               //tobacco/tobacco"}
               //%%java.lang.ArithmeticException: Overflow occurred from int -50000000 * 49
               {"tobacco/tobacco"},

               //kordemskys_palindrome_problem
               //java.lang.NumberFormatException: For input string: "9999999999"
               {"kordemskys_palindrome_problem/kordemskys_palindrome_problem"},

               //cluster
                //Symbol "X_INTRODUCED_65" does not have assigned value when refered; execution aborted
                // {"cluster/cluster"},

                //2DBinPacking
                {"errors/2DBinPacking/Class1_20_1"},
                {"errors/2DBinPacking/Class1_20_2"},
                {"errors/2DBinPacking/Class1_20_3"},
                {"errors/2DBinPacking/Class1_20_4"},
                {"errors/2DBinPacking/Class1_20_5"},
                {"errors/2DBinPacking/Class1_20_6"},
                {"errors/2DBinPacking/Class1_20_7"},
                {"errors/2DBinPacking/Class1_20_8"},
                {"errors/2DBinPacking/Class1_20_9"},
                {"errors/2DBinPacking/Class1_20_10"},
                {"errors/2DBinPacking/Class1_40_1"},
                {"errors/2DBinPacking/Class1_40_2"},
                {"errors/2DBinPacking/Class1_40_3"},
                {"errors/2DBinPacking/Class1_40_4"},
                {"errors/2DBinPacking/Class1_40_5"},
                {"errors/2DBinPacking/Class1_40_6"},
                {"errors/2DBinPacking/Class1_40_7"},
                {"errors/2DBinPacking/Class1_40_8"},
                {"errors/2DBinPacking/Class1_40_9"},
                {"errors/2DBinPacking/Class1_40_10"},
                {"errors/2DBinPacking/Class1_60_1"},
                {"errors/2DBinPacking/Class1_60_2"},
                {"errors/2DBinPacking/Class1_60_3"},
                {"errors/2DBinPacking/Class1_60_4"},
                {"errors/2DBinPacking/Class1_60_5"},
                {"errors/2DBinPacking/Class1_60_6"},
                {"errors/2DBinPacking/Class1_60_7"},
                {"errors/2DBinPacking/Class1_60_8"},
                {"errors/2DBinPacking/Class1_60_9"},
                {"errors/2DBinPacking/Class1_60_10"},
                {"errors/2DBinPacking/Class1_80_1"},
                {"errors/2DBinPacking/Class1_80_2"},
                {"errors/2DBinPacking/Class1_80_3"},
                {"errors/2DBinPacking/Class1_80_4"},
                {"errors/2DBinPacking/Class1_80_5"},
                {"errors/2DBinPacking/Class1_80_6"},
                {"errors/2DBinPacking/Class1_80_7"},
                {"errors/2DBinPacking/Class1_80_8"},
                {"errors/2DBinPacking/Class1_80_9"},
                {"errors/2DBinPacking/Class1_80_10"},
                {"errors/2DBinPacking/Class1_100_1"},
                {"errors/2DBinPacking/Class1_100_2"},
                {"errors/2DBinPacking/Class1_100_3"},
                {"errors/2DBinPacking/Class1_100_4"},
                {"errors/2DBinPacking/Class1_100_5"},
                {"errors/2DBinPacking/Class1_100_6"},
                {"errors/2DBinPacking/Class1_100_7"},
                {"errors/2DBinPacking/Class1_100_8"},
                {"errors/2DBinPacking/Class1_100_9"},
                {"errors/2DBinPacking/Class1_100_10"},

       */

        });
    }



    @Test(timeout = 5400000) public void testMinizinc() throws IOException {

        List<String> expectedResult = expected(this.inputString + ".out");
        List<String> result = result(this.inputString + ".fzn");

        for (int i = 0; i < result.size(); i++) {
            assertEquals(System.getProperty("line.separator") + "File path: " + inputString + ".out " + System.getProperty("line.separator")
                + "Error line number: " + (i + 1) + System.getProperty("line.separator"), expectedResult.get(i), result.get(i));
        }

    }


    public static List<String> result(String filename) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream old = System.out;
        System.setOut(new PrintStream(baos));


        fz2jacop.main(new String[] {relativePath + filename});

        System.out.flush();
        System.setOut(old);

        String result = baos.toString();
        if (printInfo) {
            System.out.println(filename + System.getProperty("line.separator") + result);
        }

        return Arrays.asList(result.split("\n"));
    }


    public static List<String> expected(String filename) throws IOException {

        String filePath = new File(relativePath + filename).getAbsolutePath();


        return Files.readAllLines(Paths.get(filePath), StandardCharsets.UTF_8);
    }


}
