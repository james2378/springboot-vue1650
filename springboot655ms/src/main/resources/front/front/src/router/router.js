import VueRouter from 'vue-router'

//引入组件
import Index from '../pages'
import Home from '../pages/home/home'
import Login from '../pages/login/login'
import Register from '../pages/register/register'
import Center from '../pages/center/center'
import Storeup from '../pages/storeup/list'
import News from '../pages/news/news-list'
import NewsDetail from '../pages/news/news-detail'
import yonghuList from '../pages/yonghu/list'
import yonghuDetail from '../pages/yonghu/detail'
import yonghuAdd from '../pages/yonghu/add'
import tianqiyubaoList from '../pages/tianqiyubao/list'
import tianqiyubaoDetail from '../pages/tianqiyubao/detail'
import tianqiyubaoAdd from '../pages/tianqiyubao/add'
import jingdianxinxiList from '../pages/jingdianxinxi/list'
import jingdianxinxiDetail from '../pages/jingdianxinxi/detail'
import jingdianxinxiAdd from '../pages/jingdianxinxi/add'
import menpiaoyudingList from '../pages/menpiaoyuding/list'
import menpiaoyudingDetail from '../pages/menpiaoyuding/detail'
import menpiaoyudingAdd from '../pages/menpiaoyuding/add'
import jiudianxinxiList from '../pages/jiudianxinxi/list'
import jiudianxinxiDetail from '../pages/jiudianxinxi/detail'
import jiudianxinxiAdd from '../pages/jiudianxinxi/add'
import jiudianyudingList from '../pages/jiudianyuding/list'
import jiudianyudingDetail from '../pages/jiudianyuding/detail'
import jiudianyudingAdd from '../pages/jiudianyuding/add'
import cantingxinxiList from '../pages/cantingxinxi/list'
import cantingxinxiDetail from '../pages/cantingxinxi/detail'
import cantingxinxiAdd from '../pages/cantingxinxi/add'
import cantingyudingList from '../pages/cantingyuding/list'
import cantingyudingDetail from '../pages/cantingyuding/detail'
import cantingyudingAdd from '../pages/cantingyuding/add'
import jiaotongluxianList from '../pages/jiaotongluxian/list'
import jiaotongluxianDetail from '../pages/jiaotongluxian/detail'
import jiaotongluxianAdd from '../pages/jiaotongluxian/add'
import lvxingrijiList from '../pages/lvxingriji/list'
import lvxingrijiDetail from '../pages/lvxingriji/detail'
import lvxingrijiAdd from '../pages/lvxingriji/add'
import lvyouguihuaList from '../pages/lvyouguihua/list'
import lvyouguihuaDetail from '../pages/lvyouguihua/detail'
import lvyouguihuaAdd from '../pages/lvyouguihua/add'

const originalPush = VueRouter.prototype.push
VueRouter.prototype.push = function push(location) {
	return originalPush.call(this, location).catch(err => err)
}

//配置路由
export default new VueRouter({
	routes:[
		{
      path: '/',
      redirect: '/index/home'
    },
		{
			path: '/index',
			component: Index,
			children:[
				{
					path: 'home',
					component: Home
				},
				{
					path: 'center',
					component: Center,
				},
				{
					path: 'storeup',
					component: Storeup
				},
				{
					path: 'news',
					component: News
				},
				{
					path: 'newsDetail',
					component: NewsDetail
				},
				{
					path: 'yonghu',
					component: yonghuList
				},
				{
					path: 'yonghuDetail',
					component: yonghuDetail
				},
				{
					path: 'yonghuAdd',
					component: yonghuAdd
				},
				{
					path: 'tianqiyubao',
					component: tianqiyubaoList
				},
				{
					path: 'tianqiyubaoDetail',
					component: tianqiyubaoDetail
				},
				{
					path: 'tianqiyubaoAdd',
					component: tianqiyubaoAdd
				},
				{
					path: 'jingdianxinxi',
					component: jingdianxinxiList
				},
				{
					path: 'jingdianxinxiDetail',
					component: jingdianxinxiDetail
				},
				{
					path: 'jingdianxinxiAdd',
					component: jingdianxinxiAdd
				},
				{
					path: 'menpiaoyuding',
					component: menpiaoyudingList
				},
				{
					path: 'menpiaoyudingDetail',
					component: menpiaoyudingDetail
				},
				{
					path: 'menpiaoyudingAdd',
					component: menpiaoyudingAdd
				},
				{
					path: 'jiudianxinxi',
					component: jiudianxinxiList
				},
				{
					path: 'jiudianxinxiDetail',
					component: jiudianxinxiDetail
				},
				{
					path: 'jiudianxinxiAdd',
					component: jiudianxinxiAdd
				},
				{
					path: 'jiudianyuding',
					component: jiudianyudingList
				},
				{
					path: 'jiudianyudingDetail',
					component: jiudianyudingDetail
				},
				{
					path: 'jiudianyudingAdd',
					component: jiudianyudingAdd
				},
				{
					path: 'cantingxinxi',
					component: cantingxinxiList
				},
				{
					path: 'cantingxinxiDetail',
					component: cantingxinxiDetail
				},
				{
					path: 'cantingxinxiAdd',
					component: cantingxinxiAdd
				},
				{
					path: 'cantingyuding',
					component: cantingyudingList
				},
				{
					path: 'cantingyudingDetail',
					component: cantingyudingDetail
				},
				{
					path: 'cantingyudingAdd',
					component: cantingyudingAdd
				},
				{
					path: 'jiaotongluxian',
					component: jiaotongluxianList
				},
				{
					path: 'jiaotongluxianDetail',
					component: jiaotongluxianDetail
				},
				{
					path: 'jiaotongluxianAdd',
					component: jiaotongluxianAdd
				},
				{
					path: 'lvxingriji',
					component: lvxingrijiList
				},
				{
					path: 'lvxingrijiDetail',
					component: lvxingrijiDetail
				},
				{
					path: 'lvxingrijiAdd',
					component: lvxingrijiAdd
				},
				{
					path: 'lvyouguihua',
					component: lvyouguihuaList
				},
				{
					path: 'lvyouguihuaDetail',
					component: lvyouguihuaDetail
				},
				{
					path: 'lvyouguihuaAdd',
					component: lvyouguihuaAdd
				},
			]
		},
		{
			path: '/login',
			component: Login
		},
		{
			path: '/register',
			component: Register
		},
	]
})
