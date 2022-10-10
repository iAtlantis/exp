<template>
  <div id="app">
    <!--    头部区域-->
    <div style="height: 60px;line-height: 60px;background-color: white; margin-bottom: 2px">
      <img src="@/assets/logo.png" alt="" style="width: 40px;position: relative; top: 10px;left: 20px">
      <span style="margin-left: 25px;font-size: 24px">专家推荐系统</span>
    </div>

    <!--    侧边栏和主体-->
    <div style="display: flex">
      <!--    侧边栏-->
      <div style="width: 200px;min-height: calc(100vh - 62px);overflow: hidden;margin-right: 2px;background-color: white">
        <el-menu :default-active="$router.path" router class="el-menu-demo" >
          <el-menu-item index="/">
            <i class="el-icon-s-home"/>
            <span>首页</span>
          </el-menu-item>
          <el-submenu>
            <template slot="title">
              <i class="el-icon-user"/>
              <span>评审专家</span>
            </template>
            <el-menu-item index="/expertShow">专家信息</el-menu-item>
          </el-submenu>

<!--          领域标签-->
<!--          - 标签展示-->
<!--          - 热门领域-->
<!--          专家信息-->
<!--            专家风采-->
<!--              专家详情-->
<!--          为我推荐-->

        </el-menu>
      </div>

      <!--    主体-->
      <div style="flex: 1;background-color: white">
        <router-view/>

      </div>


    </div>

  </div>
</template>

