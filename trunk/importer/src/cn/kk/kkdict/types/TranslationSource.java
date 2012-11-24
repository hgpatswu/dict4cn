/*  Copyright (c) 2010 Xiaoyun Zhu
 * 
 *  Permission is hereby granted, free of charge, to any person obtaining a copy  
 *  of this software and associated documentation files (the "Software", 2), to deal  
 *  in the Software without restriction, including without limitation the rights  
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell  
 *  copies of the Software, and to permit persons to whom the Software is  
 *  furnished to do so, subject to the following conditions:
 *  
 *  The above copyright notice and this permission notice shall be included in  
 *  all copies or substantial portions of the Software.
 *  
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR  
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,  
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE  
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER  
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,  
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN  
 *  THE SOFTWARE.  
 */
package cn.kk.kkdict.types;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

import cn.kk.kkdict.utils.Helper;

public enum TranslationSource {
  USER_INPUT("usr", 1),
  EDICT_JA_EN("edict_je", 4),
  EDICT_ZH_DE("edict_hande", 4),
  EDICT_ZH_ES("edict_hispac", 4),
  EDICT_ZH_EN("edict_ce", 4),
  EDICT_ZH_FR("edict_cf", 4),
  LEO_DICT("leodict_www", 5),
  GOOGLE_TRANSLATION("googletrans_www", 6),
  BABYLON_DICT("babylon_bdict", 7),
  MYDICT("mydict_www", 8),
  STARDICT("stardict_ifo", 9),
  LINGOES_LD2("lingoes_ld2", 10),
  TERMWIKI("termwiki", 11),
  BABLA("babla", 12),
  WEBLIO("weblio", 13),

  WIKI_AA("wiki_aa", 2),
  WIKI_AB("wiki_ab", 2),
  WIKI_ACE("wiki_ace", 2),
  WIKI_AF("wiki_af", 2),
  WIKI_AK("wiki_ak", 2),
  WIKI_ALS("wiki_als", 2),
  WIKI_AM("wiki_am", 2),
  WIKI_AN("wiki_an", 2),
  WIKI_ANG("wiki_ang", 2),
  WIKI_AR("wiki_ar", 2),
  WIKI_ARC("wiki_arc", 2),
  WIKI_ARZ("wiki_arz", 2),
  WIKI_AS("wiki_as", 2),
  WIKI_AST("wiki_ast", 2),
  WIKI_AV("wiki_av", 2),
  WIKI_AY("wiki_ay", 2),
  WIKI_AZ("wiki_az", 2),
  WIKI_BA("wiki_ba", 2),
  WIKI_BAR("wiki_bar", 2),
  WIKI_BAT_SMG("wiki_bat_smg", 2),
  WIKI_BCL("wiki_bcl", 2),
  WIKI_BE("wiki_be", 2),
  WIKI_BE_X_OLD("wiki_be_x_old", 2),
  WIKI_BG("wiki_bg", 2),
  WIKI_BH("wiki_bh", 2),
  WIKI_BI("wiki_bi", 2),
  WIKI_BJN("wiki_bjn", 2),
  WIKI_BM("wiki_bm", 2),
  WIKI_BN("wiki_bn", 2),
  WIKI_BO("wiki_bo", 2),
  WIKI_BPY("wiki_bpy", 2),
  WIKI_BR("wiki_br", 2),
  WIKI_BS("wiki_bs", 2),
  WIKI_BUG("wiki_bug", 2),
  WIKI_BXR("wiki_bxr", 2),
  WIKI_CA("wiki_ca", 2),
  WIKI_CBK_ZAM("wiki_cbk_zam", 2),
  WIKI_CDO("wiki_cdo", 2),
  WIKI_CE("wiki_ce", 2),
  WIKI_CEB("wiki_ceb", 2),
  WIKI_CH("wiki_ch", 2),
  WIKI_CHO("wiki_cho", 2),
  WIKI_CHR("wiki_chr", 2),
  WIKI_CHY("wiki_chy", 2),
  WIKI_CKB("wiki_ckb", 2),
  WIKI_CO("wiki_co", 2),
  WIKI_CR("wiki_cr", 2),
  WIKI_CRH("wiki_crh", 2),
  WIKI_CS("wiki_cs", 2),
  WIKI_CSB("wiki_csb", 2),
  WIKI_CU("wiki_cu", 2),
  WIKI_CV("wiki_cv", 2),
  WIKI_CY("wiki_cy", 2),
  WIKI_DA("wiki_da", 2),
  WIKI_DE("wiki_de", 2),
  WIKI_DIQ("wiki_diq", 2),
  WIKI_DSB("wiki_dsb", 2),
  WIKI_DV("wiki_dv", 2),
  WIKI_DZ("wiki_dz", 2),
  WIKI_EE("wiki_ee", 2),
  WIKI_EL("wiki_el", 2),
  WIKI_EML("wiki_eml", 2),
  WIKI_EN("wiki_en", 2),
  WIKI_EO("wiki_eo", 2),
  WIKI_ES("wiki_es", 2),
  WIKI_ET("wiki_et", 2),
  WIKI_EU("wiki_eu", 2),
  WIKI_EXT("wiki_ext", 2),
  WIKI_FA("wiki_fa", 2),
  WIKI_FF("wiki_ff", 2),
  WIKI_FI("wiki_fi", 2),
  WIKI_FIU_VRO("wiki_fiu_vro", 2),
  WIKI_FJ("wiki_fj", 2),
  WIKI_FO("wiki_fo", 2),
  WIKI_FR("wiki_fr", 2),
  WIKI_FRP("wiki_frp", 2),
  WIKI_FRR("wiki_frr", 2),
  WIKI_FUR("wiki_fur", 2),
  WIKI_FY("wiki_fy", 2),
  WIKI_GA("wiki_ga", 2),
  WIKI_GAG("wiki_gag", 2),
  WIKI_GAN("wiki_gan", 2),
  WIKI_GD("wiki_gd", 2),
  WIKI_GL("wiki_gl", 2),
  WIKI_GLK("wiki_glk", 2),
  WIKI_GN("wiki_gn", 2),
  WIKI_GOT("wiki_got", 2),
  WIKI_GU("wiki_gu", 2),
  WIKI_GV("wiki_gv", 2),
  WIKI_HA("wiki_ha", 2),
  WIKI_HAK("wiki_hak", 2),
  WIKI_HAW("wiki_haw", 2),
  WIKI_HE("wiki_he", 2),
  WIKI_HI("wiki_hi", 2),
  WIKI_HIF("wiki_hif", 2),
  WIKI_HO("wiki_ho", 2),
  WIKI_HR("wiki_hr", 2),
  WIKI_HSB("wiki_hsb", 2),
  WIKI_HT("wiki_ht", 2),
  WIKI_HU("wiki_hu", 2),
  WIKI_HY("wiki_hy", 2),
  WIKI_HZ("wiki_hz", 2),
  WIKI_IA("wiki_ia", 2),
  WIKI_ID("wiki_id", 2),
  WIKI_IE("wiki_ie", 2),
  WIKI_IG("wiki_ig", 2),
  WIKI_II("wiki_ii", 2),
  WIKI_IK("wiki_ik", 2),
  WIKI_ILO("wiki_ilo", 2),
  WIKI_IO("wiki_io", 2),
  WIKI_IS("wiki_is", 2),
  WIKI_IT("wiki_it", 2),
  WIKI_IU("wiki_iu", 2),
  WIKI_JA("wiki_ja", 2),
  WIKI_JBO("wiki_jbo", 2),
  WIKI_JV("wiki_jv", 2),
  WIKI_KA("wiki_ka", 2),
  WIKI_KAA("wiki_kaa", 2),
  WIKI_KAB("wiki_kab", 2),
  WIKI_KBD("wiki_kbd", 2),
  WIKI_KG("wiki_kg", 2),
  WIKI_KI("wiki_ki", 2),
  WIKI_KJ("wiki_kj", 2),
  WIKI_KK("wiki_kk", 2),
  WIKI_KL("wiki_kl", 2),
  WIKI_KM("wiki_km", 2),
  WIKI_KN("wiki_kn", 2),
  WIKI_KO("wiki_ko", 2),
  WIKI_KOI("wiki_koi", 2),
  WIKI_KR("wiki_kr", 2),
  WIKI_KRC("wiki_krc", 2),
  WIKI_KS("wiki_ks", 2),
  WIKI_KSH("wiki_ksh", 2),
  WIKI_KU("wiki_ku", 2),
  WIKI_KV("wiki_kv", 2),
  WIKI_KW("wiki_kw", 2),
  WIKI_KY("wiki_ky", 2),
  WIKI_LA("wiki_la", 2),
  WIKI_LAD("wiki_lad", 2),
  WIKI_LB("wiki_lb", 2),
  WIKI_LBE("wiki_lbe", 2),
  WIKI_LG("wiki_lg", 2),
  WIKI_LI("wiki_li", 2),
  WIKI_LIJ("wiki_lij", 2),
  WIKI_LMO("wiki_lmo", 2),
  WIKI_LN("wiki_ln", 2),
  WIKI_LO("wiki_lo", 2),
  WIKI_LT("wiki_lt", 2),
  WIKI_LTG("wiki_ltg", 2),
  WIKI_LV("wiki_lv", 2),
  WIKI_MAP_BMS("wiki_map_bms", 2),
  WIKI_MDF("wiki_mdf", 2),
  WIKI_MG("wiki_mg", 2),
  WIKI_MH("wiki_mh", 2),
  WIKI_MHR("wiki_mhr", 2),
  WIKI_MI("wiki_mi", 2),
  WIKI_MK("wiki_mk", 2),
  WIKI_ML("wiki_ml", 2),
  WIKI_MN("wiki_mn", 2),
  WIKI_MO("wiki_mo", 2),
  WIKI_MR("wiki_mr", 2),
  WIKI_MRJ("wiki_mrj", 2),
  WIKI_MS("wiki_ms", 2),
  WIKI_MT("wiki_mt", 2),
  WIKI_MUS("wiki_mus", 2),
  WIKI_MWL("wiki_mwl", 2),
  WIKI_MY("wiki_my", 2),
  WIKI_MYV("wiki_myv", 2),
  WIKI_MZN("wiki_mzn", 2),
  WIKI_NA("wiki_na", 2),
  WIKI_NAH("wiki_nah", 2),
  WIKI_NAP("wiki_nap", 2),
  WIKI_NDS("wiki_nds", 2),
  WIKI_NDS_NL("wiki_nds_nl", 2),
  WIKI_NE("wiki_ne", 2),
  WIKI_NEW("wiki_new", 2),
  WIKI_NG("wiki_ng", 2),
  WIKI_NL("wiki_nl", 2),
  WIKI_NN("wiki_nn", 2),
  WIKI_NO("wiki_no", 2),
  WIKI_NOV("wiki_nov", 2),
  WIKI_NRM("wiki_nrm", 2),
  WIKI_NSO("wiki_nso", 2),
  WIKI_NV("wiki_nv", 2),
  WIKI_NY("wiki_ny", 2),
  WIKI_OC("wiki_oc", 2),
  WIKI_OM("wiki_om", 2),
  WIKI_OR("wiki_or", 2),
  WIKI_OS("wiki_os", 2),
  WIKI_PA("wiki_pa", 2),
  WIKI_PAG("wiki_pag", 2),
  WIKI_PAM("wiki_pam", 2),
  WIKI_PAP("wiki_pap", 2),
  WIKI_PCD("wiki_pcd", 2),
  WIKI_PDC("wiki_pdc", 2),
  WIKI_PFL("wiki_pfl", 2),
  WIKI_PI("wiki_pi", 2),
  WIKI_PIH("wiki_pih", 2),
  WIKI_PL("wiki_pl", 2),
  WIKI_PMS("wiki_pms", 2),
  WIKI_PNB("wiki_pnb", 2),
  WIKI_PNT("wiki_pnt", 2),
  WIKI_PS("wiki_ps", 2),
  WIKI_PT("wiki_pt", 2),
  WIKI_QU("wiki_qu", 2),
  WIKI_RM("wiki_rm", 2),
  WIKI_RMY("wiki_rmy", 2),
  WIKI_RN("wiki_rn", 2),
  WIKI_RO("wiki_ro", 2),
  WIKI_ROA_RUP("wiki_roa_rup", 2),
  WIKI_ROA_TARA("wiki_roa_tara", 2),
  WIKI_RU("wiki_ru", 2),
  WIKI_RUE("wiki_rue", 2),
  WIKI_RW("wiki_rw", 2),
  WIKI_SA("wiki_sa", 2),
  WIKI_SAH("wiki_sah", 2),
  WIKI_SC("wiki_sc", 2),
  WIKI_SCN("wiki_scn", 2),
  WIKI_SCO("wiki_sco", 2),
  WIKI_SD("wiki_sd", 2),
  WIKI_SE("wiki_se", 2),
  WIKI_SG("wiki_sg", 2),
  WIKI_SH("wiki_sh", 2),
  WIKI_SI("wiki_si", 2),
  WIKI_SIMPLE("wiki_simple", 2),
  WIKI_SK("wiki_sk", 2),
  WIKI_SL("wiki_sl", 2),
  WIKI_SM("wiki_sm", 2),
  WIKI_SN("wiki_sn", 2),
  WIKI_SO("wiki_so", 2),
  WIKI_SQ("wiki_sq", 2),
  WIKI_SR("wiki_sr", 2),
  WIKI_SRN("wiki_srn", 2),
  WIKI_SS("wiki_ss", 2),
  WIKI_ST("wiki_st", 2),
  WIKI_STQ("wiki_stq", 2),
  WIKI_SU("wiki_su", 2),
  WIKI_SV("wiki_sv", 2),
  WIKI_SW("wiki_sw", 2),
  WIKI_SZL("wiki_szl", 2),
  WIKI_TA("wiki_ta", 2),
  WIKI_TE("wiki_te", 2),
  WIKI_TET("wiki_tet", 2),
  WIKI_TG("wiki_tg", 2),
  WIKI_TH("wiki_th", 2),
  WIKI_TI("wiki_ti", 2),
  WIKI_TK("wiki_tk", 2),
  WIKI_TL("wiki_tl", 2),
  WIKI_TN("wiki_tn", 2),
  WIKI_TO("wiki_to", 2),
  WIKI_TPI("wiki_tpi", 2),
  WIKI_TR("wiki_tr", 2),
  WIKI_TS("wiki_ts", 2),
  WIKI_TT("wiki_tt", 2),
  WIKI_TUM("wiki_tum", 2),
  WIKI_TW("wiki_tw", 2),
  WIKI_TY("wiki_ty", 2),
  WIKI_UDM("wiki_udm", 2),
  WIKI_UG("wiki_ug", 2),
  WIKI_UK("wiki_uk", 2),
  WIKI_UR("wiki_ur", 2),
  WIKI_UZ("wiki_uz", 2),
  WIKI_VE("wiki_ve", 2),
  WIKI_VEC("wiki_vec", 2),
  WIKI_VEP("wiki_vep", 2),
  WIKI_VI("wiki_vi", 2),
  WIKI_VLS("wiki_vls", 2),
  WIKI_VO("wiki_vo", 2),
  WIKI_WA("wiki_wa", 2),
  WIKI_WAR("wiki_war", 2),
  WIKI_WO("wiki_wo", 2),
  WIKI_WUU("wiki_wuu", 2),
  WIKI_XAL("wiki_xal", 2),
  WIKI_XH("wiki_xh", 2),
  WIKI_XMF("wiki_xmf", 2),
  WIKI_YI("wiki_yi", 2),
  WIKI_YO("wiki_yo", 2),
  WIKI_ZA("wiki_za", 2),
  WIKI_ZEA("wiki_zea", 2),
  WIKI_ZH("wiki_zh", 2),
  WIKI_ZH_CLASSICAL("wiki_zh_classical", 2),
  WIKI_ZH_MIN_NAN("wiki_zh_min_nan", 2),
  WIKI_ZH_YUE("wiki_zh_yue", 2),
  WIKI_ZU("wiki_zu", 2),
  WIKT_AA("wikt_aa", 3),
  WIKT_AB("wikt_ab", 3),
  WIKT_AF("wikt_af", 3),
  WIKT_AK("wikt_ak", 3),
  WIKT_ALS("wikt_als", 3),
  WIKT_AM("wikt_am", 3),
  WIKT_AN("wikt_an", 3),
  WIKT_ANG("wikt_ang", 3),
  WIKT_AR("wikt_ar", 3),
  WIKT_AS("wikt_as", 3),
  WIKT_AST("wikt_ast", 3),
  WIKT_AV("wikt_av", 3),
  WIKT_AY("wikt_ay", 3),
  WIKT_AZ("wikt_az", 3),
  WIKT_BE("wikt_be", 3),
  WIKT_BG("wikt_bg", 3),
  WIKT_BH("wikt_bh", 3),
  WIKT_BI("wikt_bi", 3),
  WIKT_BM("wikt_bm", 3),
  WIKT_BN("wikt_bn", 3),
  WIKT_BO("wikt_bo", 3),
  WIKT_BR("wikt_br", 3),
  WIKT_BS("wikt_bs", 3),
  WIKT_CA("wikt_ca", 3),
  WIKT_CH("wikt_ch", 3),
  WIKT_CHR("wikt_chr", 3),
  WIKT_CO("wikt_co", 3),
  WIKT_CR("wikt_cr", 3),
  WIKT_CS("wikt_cs", 3),
  WIKT_CSB("wikt_csb", 3),
  WIKT_CY("wikt_cy", 3),
  WIKT_DA("wikt_da", 3),
  WIKT_DE("wikt_de", 3),
  WIKT_DV("wikt_dv", 3),
  WIKT_DZ("wikt_dz", 3),
  WIKT_EL("wikt_el", 3),
  WIKT_EN("wikt_en", 3),
  WIKT_EO("wikt_eo", 3),
  WIKT_ES("wikt_es", 3),
  WIKT_ET("wikt_et", 3),
  WIKT_EU("wikt_eu", 3),
  WIKT_FA("wikt_fa", 3),
  WIKT_FI("wikt_fi", 3),
  WIKT_FJ("wikt_fj", 3),
  WIKT_FO("wikt_fo", 3),
  WIKT_FR("wikt_fr", 3),
  WIKT_FY("wikt_fy", 3),
  WIKT_GA("wikt_ga", 3),
  WIKT_GD("wikt_gd", 3),
  WIKT_GL("wikt_gl", 3),
  WIKT_GN("wikt_gn", 3),
  WIKT_GU("wikt_gu", 3),
  WIKT_GV("wikt_gv", 3),
  WIKT_HA("wikt_ha", 3),
  WIKT_HE("wikt_he", 3),
  WIKT_HI("wikt_hi", 3),
  WIKT_HR("wikt_hr", 3),
  WIKT_HSB("wikt_hsb", 3),
  WIKT_HU("wikt_hu", 3),
  WIKT_HY("wikt_hy", 3),
  WIKT_IA("wikt_ia", 3),
  WIKT_ID("wikt_id", 3),
  WIKT_IE("wikt_ie", 3),
  WIKT_IK("wikt_ik", 3),
  WIKT_IO("wikt_io", 3),
  WIKT_IS("wikt_is", 3),
  WIKT_IT("wikt_it", 3),
  WIKT_IU("wikt_iu", 3),
  WIKT_JA("wikt_ja", 3),
  WIKT_JBO("wikt_jbo", 3),
  WIKT_JV("wikt_jv", 3),
  WIKT_KA("wikt_ka", 3),
  WIKT_KK("wikt_kk", 3),
  WIKT_KL("wikt_kl", 3),
  WIKT_KM("wikt_km", 3),
  WIKT_KN("wikt_kn", 3),
  WIKT_KO("wikt_ko", 3),
  WIKT_KS("wikt_ks", 3),
  WIKT_KU("wikt_ku", 3),
  WIKT_KW("wikt_kw", 3),
  WIKT_KY("wikt_ky", 3),
  WIKT_LA("wikt_la", 3),
  WIKT_LB("wikt_lb", 3),
  WIKT_LI("wikt_li", 3),
  WIKT_LN("wikt_ln", 3),
  WIKT_LO("wikt_lo", 3),
  WIKT_LT("wikt_lt", 3),
  WIKT_LV("wikt_lv", 3),
  WIKT_MG("wikt_mg", 3),
  WIKT_MH("wikt_mh", 3),
  WIKT_MI("wikt_mi", 3),
  WIKT_MK("wikt_mk", 3),
  WIKT_ML("wikt_ml", 3),
  WIKT_MN("wikt_mn", 3),
  WIKT_MO("wikt_mo", 3),
  WIKT_MR("wikt_mr", 3),
  WIKT_MS("wikt_ms", 3),
  WIKT_MT("wikt_mt", 3),
  WIKT_MY("wikt_my", 3),
  WIKT_NA("wikt_na", 3),
  WIKT_NAH("wikt_nah", 3),
  WIKT_NDS("wikt_nds", 3),
  WIKT_NE("wikt_ne", 3),
  WIKT_NL("wikt_nl", 3),
  WIKT_NN("wikt_nn", 3),
  WIKT_NO("wikt_no", 3),
  WIKT_OC("wikt_oc", 3),
  WIKT_OM("wikt_om", 3),
  WIKT_OR("wikt_or", 3),
  WIKT_PA("wikt_pa", 3),
  WIKT_PI("wikt_pi", 3),
  WIKT_PL("wikt_pl", 3),
  WIKT_PNB("wikt_pnb", 3),
  WIKT_PS("wikt_ps", 3),
  WIKT_PT("wikt_pt", 3),
  WIKT_QU("wikt_qu", 3),
  WIKT_RM("wikt_rm", 3),
  WIKT_RN("wikt_rn", 3),
  WIKT_RO("wikt_ro", 3),
  WIKT_ROA_RUP("wikt_roa_rup", 3),
  WIKT_RU("wikt_ru", 3),
  WIKT_RW("wikt_rw", 3),
  WIKT_SA("wikt_sa", 3),
  WIKT_SC("wikt_sc", 3),
  WIKT_SCN("wikt_scn", 3),
  WIKT_SD("wikt_sd", 3),
  WIKT_SG("wikt_sg", 3),
  WIKT_SH("wikt_sh", 3),
  WIKT_SI("wikt_si", 3),
  WIKT_SIMPLE("wikt_simple", 3),
  WIKT_SK("wikt_sk", 3),
  WIKT_SL("wikt_sl", 3),
  WIKT_SM("wikt_sm", 3),
  WIKT_SN("wikt_sn", 3),
  WIKT_SO("wikt_so", 3),
  WIKT_SQ("wikt_sq", 3),
  WIKT_SR("wikt_sr", 3),
  WIKT_SS("wikt_ss", 3),
  WIKT_ST("wikt_st", 3),
  WIKT_SU("wikt_su", 3),
  WIKT_SV("wikt_sv", 3),
  WIKT_SW("wikt_sw", 3),
  WIKT_TA("wikt_ta", 3),
  WIKT_TE("wikt_te", 3),
  WIKT_TG("wikt_tg", 3),
  WIKT_TH("wikt_th", 3),
  WIKT_TI("wikt_ti", 3),
  WIKT_TK("wikt_tk", 3),
  WIKT_TL("wikt_tl", 3),
  WIKT_TN("wikt_tn", 3),
  WIKT_TO("wikt_to", 3),
  WIKT_TPI("wikt_tpi", 3),
  WIKT_TR("wikt_tr", 3),
  WIKT_TS("wikt_ts", 3),
  WIKT_TT("wikt_tt", 3),
  WIKT_TW("wikt_tw", 3),
  WIKT_UG("wikt_ug", 3),
  WIKT_UK("wikt_uk", 3),
  WIKT_UR("wikt_ur", 3),
  WIKT_UZ("wikt_uz", 3),
  WIKT_VI("wikt_vi", 3),
  WIKT_VO("wikt_vo", 3),
  WIKT_WA("wikt_wa", 3),
  WIKT_WO("wikt_wo", 3),
  WIKT_XH("wikt_xh", 3),
  WIKT_YI("wikt_yi", 3),
  WIKT_YO("wikt_yo", 3),
  WIKT_ZA("wikt_za", 3),
  WIKT_ZH("wikt_zh", 3),
  WIKT_ZH_MIN_NAN("wikt_zh_min_nan", 3),
  WIKT_ZU("wikt_zu", 3), ;
  public static final String TYPE_ID       = "源";

  public static final byte[] TYPE_ID_BYTES = TranslationSource.TYPE_ID.getBytes(Helper.CHARSET_UTF8);

  public final int           id;

  public final String        key;

  public final byte[]        keyBytes;

  TranslationSource(final String key, final int id) {
    this.id = id;
    this.key = key;
    this.keyBytes = key.getBytes(Helper.CHARSET_UTF8);
  }

  public static void main(String[] args) {
    List<TranslationSource> srcs = Arrays.asList(TranslationSource.values());
    Collections.sort(srcs, new Comparator<TranslationSource>() {
      @Override
      public int compare(TranslationSource o1, TranslationSource o2) {
        return o1.id - o2.id;
      }
    });
    int lastId = -1;
    for (TranslationSource src : srcs) {
      if (lastId != src.id) {
        lastId = src.id;
        System.out.println(src.id + "=" + new StringTokenizer(src.key, "_").nextToken());
      }
    }
  }
}