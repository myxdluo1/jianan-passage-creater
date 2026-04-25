<script setup lang="ts">
import { useLoginUserStore } from '@/stores/loginUser'

const loginUserStore = useLoginUserStore()
</script>

<template>
  <div id="homePage">

  </div>
</template>

<style scoped>
#homePage {
  width: 100%;
  margin: 0;
  padding: 0;
  min-height: 100vh;
  background: linear-gradient(180deg, #f8fafc 0%, #f1f5f9 50%, #e2e8f0 100%);
}

.container {
  max-width: 1200px;
  margin: 0 auto;
  padding: 20px;
}

/* 英雄区域 */
.hero-section {
  text-align: center;
  padding: 80px 0 60px;
  margin-bottom: 28px;
}

.hero-title {
  font-size: 48px;
  font-weight: 700;
  margin: 0 0 20px;
  background: linear-gradient(135deg, #3b82f6 0%, #8b5cf6 100%);
  -webkit-background-clip: text;
  -webkit-text-fill-color: transparent;
  background-clip: text;
}

.hero-description {
  font-size: 20px;
  margin: 0;
  color: #64748b;
}

/* 欢迎区域 */
.welcome-section {
  margin-bottom: 40px;
}

.welcome-card {
  background: rgba(255, 255, 255, 0.9);
  border-radius: 12px;
}

/* 功能介绍区域 */
.features-section {
  margin-bottom: 60px;
}

.section-title {
  font-size: 28px;
  font-weight: 600;
  margin-bottom: 24px;
  color: #1e293b;
  text-align: center;
}

.feature-card {
  height: 100%;
  background: rgba(255, 255, 255, 0.9);
  border-radius: 12px;
  transition: transform 0.3s, box-shadow 0.3s;
}

.feature-card:hover {
  transform: translateY(-4px);
  box-shadow: 0 12px 24px rgba(0, 0, 0, 0.1);
}

/* 响应式设计 */
@media (max-width: 768px) {
  .hero-title {
    font-size: 32px;
  }

  .hero-description {
    font-size: 16px;
  }
}
</style>
