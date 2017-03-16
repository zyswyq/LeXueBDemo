package com.example.dllo.lexuebdemo.home.sujectbean;

import java.util.List;

/**
 * ✎﹏﹏﹏.₯㎕*﹏﹏﹏
 *
 *
 * 　　　　 ﹏﹏﹏♥♥刘延涛✍♥♥﹏﹏
 */
public class HomeClassifyBean {

    /**
     * activity_entries : {}
     * entries : [{"entry_icon":{"height":135,"url":"https://esfile.lexue.com/file/T1PyxTB5d_1RCvBVdK.png","width":135},"entry_name":"逛商城","forward":"http://www.lexue.com/mall/index.html"},{"entry_icon":{"height":135,"url":"https://esfile.lexue.com/file/T17RxTBTZT1RCvBVdK.png","width":135},"entry_name":"新手村","forward":"http://esfile.lexue.com/share/must-read"},{"entry_icon":{"height":135,"url":"https://esfile.lexue.com/file/T1WRxTBCd_1RCvBVdK.png","width":135},"entry_name":"咖啡厅","forward":"lexuegaokao://pub"},{"entry_icon":{"height":135,"url":"https://esfile.lexue.com/file/T1qyxTByV_1RCvBVdK.png","width":135},"entry_name":"做任务","forward":"lexuegaokao://task"},{"entry_icon":{"height":135,"url":"https://esfile.lexue.com/file/T1qaxTB4__1RCvBVdK.png","width":135},"entry_name":"看直播","forward":"lexuegaokao://live","hasNew":true},{"entry_icon":{"height":135,"url":"https://esfile.lexue.com/file/T1ltxTBsWv1RCvBVdK.png","width":135},"entry_name":"看红人","forward":"lexuegaokao://teacher/40"},{"entry_icon":{"height":135,"url":"https://esfile.lexue.com/file/T14txTBvKv1RCvBVdK.png","width":135},"entry_name":"学霸区","forward":"lexuegaokao://selfSupply"},{"entry_icon":{"height":135,"url":"https://esfile.lexue.com/file/T1lyxTBbdv1RCvBVdK.png","width":135},"entry_name":"报志愿","forward":"lexuegaokao://skipVolunteer"}]
     * error_info : ok
     * footer_entries : []
     * module_entries : [{"card_description":"更多免费","entry_name":"9分钟提5分专区","forward":"lexuezhongkao://1","id":"1","key":"dapian","priority":"1"},{"card_description":"京城名师超密集知识讲解","entry_name":"系统精讲","forward":"lexuegaokao://2","id":"2","key":"wonderful_videos","priority":"2"},{"card_description":"多维度立体复习","entry_name":"精彩专题","forward":"lexuezhongkao://3","id":"3","key":"special_topic","priority":"3"},{"card_description":"乐学出品可放心食用","entry_name":"老师推荐","forward":"lexuegaokao://4","id":"4","key":"suggest_videos","priority":"4"},{"card_description":"高考无他唯手熟尔","entry_name":"刷新三观","forward":"lexuegaokao://5","id":"5","key":"refresh_videos","priority":"5"}]
     * status : 0
     */

    private ActivityEntriesBean activity_entries;
    private String error_info;
    private int status;
    private List<EntriesBean> entries;
    private List<?> footer_entries;
    private List<ModuleEntriesBean> module_entries;

    public ActivityEntriesBean getActivity_entries() {
        return activity_entries;
    }

    public void setActivity_entries(ActivityEntriesBean activity_entries) {
        this.activity_entries = activity_entries;
    }

    public String getError_info() {
        return error_info;
    }

    public void setError_info(String error_info) {
        this.error_info = error_info;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public List<EntriesBean> getEntries() {
        return entries;
    }

    public void setEntries(List<EntriesBean> entries) {
        this.entries = entries;
    }

    public List<?> getFooter_entries() {
        return footer_entries;
    }

    public void setFooter_entries(List<?> footer_entries) {
        this.footer_entries = footer_entries;
    }

    public List<ModuleEntriesBean> getModule_entries() {
        return module_entries;
    }

    public void setModule_entries(List<ModuleEntriesBean> module_entries) {
        this.module_entries = module_entries;
    }

    public static class ActivityEntriesBean {
    }

    public static class EntriesBean {
        /**
         * entry_icon : {"height":135,"url":"https://esfile.lexue.com/file/T1PyxTB5d_1RCvBVdK.png","width":135}
         * entry_name : 逛商城
         * forward : http://www.lexue.com/mall/index.html
         * hasNew : true
         */

        private EntryIconBean entry_icon;
        private String entry_name;
        private String forward;
        private boolean hasNew;

        public EntryIconBean getEntry_icon() {
            return entry_icon;
        }

        public void setEntry_icon(EntryIconBean entry_icon) {
            this.entry_icon = entry_icon;
        }

        public String getEntry_name() {
            return entry_name;
        }

        public void setEntry_name(String entry_name) {
            this.entry_name = entry_name;
        }

        public String getForward() {
            return forward;
        }

        public void setForward(String forward) {
            this.forward = forward;
        }

        public boolean isHasNew() {
            return hasNew;
        }

        public void setHasNew(boolean hasNew) {
            this.hasNew = hasNew;
        }

        public static class EntryIconBean {
            /**
             * height : 135
             * url : https://esfile.lexue.com/file/T1PyxTB5d_1RCvBVdK.png
             * width : 135
             */

            private int height;
            private String url;
            private int width;

            public int getHeight() {
                return height;
            }

            public void setHeight(int height) {
                this.height = height;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public int getWidth() {
                return width;
            }

            public void setWidth(int width) {
                this.width = width;
            }
        }
    }

    public static class ModuleEntriesBean {
        /**
         * card_description : 更多免费
         * entry_name : 9分钟提5分专区
         * forward : lexuezhongkao://1
         * id : 1
         * key : dapian
         * priority : 1
         */

        private String card_description;
        private String entry_name;
        private String forward;
        private String id;
        private String key;
        private String priority;

        public String getCard_description() {
            return card_description;
        }

        public void setCard_description(String card_description) {
            this.card_description = card_description;
        }

        public String getEntry_name() {
            return entry_name;
        }

        public void setEntry_name(String entry_name) {
            this.entry_name = entry_name;
        }

        public String getForward() {
            return forward;
        }

        public void setForward(String forward) {
            this.forward = forward;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public String getPriority() {
            return priority;
        }

        public void setPriority(String priority) {
            this.priority = priority;
        }
    }
}
