import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import menpiaoyuding from '@/views/modules/menpiaoyuding/list'
    import lvyouguihua from '@/views/modules/lvyouguihua/list'
    import news from '@/views/modules/news/list'
    import discusslvxingriji from '@/views/modules/discusslvxingriji/list'
    import tianqiyubao from '@/views/modules/tianqiyubao/list'
    import jingdianxinxi from '@/views/modules/jingdianxinxi/list'
    import discussjiudianxinxi from '@/views/modules/discussjiudianxinxi/list'
    import jiudianxinxi from '@/views/modules/jiudianxinxi/list'
    import cantingyuding from '@/views/modules/cantingyuding/list'
    import discussjiaotongluxian from '@/views/modules/discussjiaotongluxian/list'
    import lvxingriji from '@/views/modules/lvxingriji/list'
    import discusscantingxinxi from '@/views/modules/discusscantingxinxi/list'
    import cantingxinxi from '@/views/modules/cantingxinxi/list'
    import yonghu from '@/views/modules/yonghu/list'
    import discussjingdianxinxi from '@/views/modules/discussjingdianxinxi/list'
    import jiudianyuding from '@/views/modules/jiudianyuding/list'
    import config from '@/views/modules/config/list'
    import jiaotongluxian from '@/views/modules/jiaotongluxian/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '系统首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '系统首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/menpiaoyuding',
        name: '门票预订',
        component: menpiaoyuding
      }
      ,{
	path: '/lvyouguihua',
        name: '旅游规划',
        component: lvyouguihua
      }
      ,{
	path: '/news',
        name: '公告信息',
        component: news
      }
      ,{
	path: '/discusslvxingriji',
        name: '旅行日记评论',
        component: discusslvxingriji
      }
      ,{
	path: '/tianqiyubao',
        name: '天气预报',
        component: tianqiyubao
      }
      ,{
	path: '/jingdianxinxi',
        name: '景点信息',
        component: jingdianxinxi
      }
      ,{
	path: '/discussjiudianxinxi',
        name: '酒店信息评论',
        component: discussjiudianxinxi
      }
      ,{
	path: '/jiudianxinxi',
        name: '酒店信息',
        component: jiudianxinxi
      }
      ,{
	path: '/cantingyuding',
        name: '餐厅预订',
        component: cantingyuding
      }
      ,{
	path: '/discussjiaotongluxian',
        name: '交通路线评论',
        component: discussjiaotongluxian
      }
      ,{
	path: '/lvxingriji',
        name: '旅行日记',
        component: lvxingriji
      }
      ,{
	path: '/discusscantingxinxi',
        name: '餐厅信息评论',
        component: discusscantingxinxi
      }
      ,{
	path: '/cantingxinxi',
        name: '餐厅信息',
        component: cantingxinxi
      }
      ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
      ,{
	path: '/discussjingdianxinxi',
        name: '景点信息评论',
        component: discussjingdianxinxi
      }
      ,{
	path: '/jiudianyuding',
        name: '酒店预订',
        component: jiudianyuding
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
      ,{
	path: '/jiaotongluxian',
        name: '交通路线',
        component: jiaotongluxian
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '系统首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})
const originalPush = VueRouter.prototype.push
//修改原型对象中的push方法
VueRouter.prototype.push = function push(location) {
   return originalPush.call(this, location).catch(err => err)
}
export default router;
