const base = {
    get() {
        return {
            url : "http://localhost:8080/ssmwx60g/",
            name: "ssmwx60g",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmwx60g/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "基于Vue的戒烟网站"
        } 
    }
}
export default base
