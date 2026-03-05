# POC 3: Branch-Based Deployment with GitHub Actions

## Overview
This POC demonstrates branch-based CI/CD deployment using **GitHub Actions**.

| Branch | Pipeline Behaviour |
|--------|-------------------|
| `main` | Build → Test → **Deploy to Production** |
| `develop` | Build → Test → **Deploy to Development** |
| `feature/*` | Build → Test → **No Deployment** |

## Tech Stack
- **Backend:** Java 17 + Spring Boot 3
- **Frontend:** HTML + CSS (served by Spring Boot)
- **CI/CD:** GitHub Actions
- **Secrets:** GitHub Repository Secrets + GitHub Environments

## How to Run Locally
```bash
cd my-app
mvn spring-boot:run
```
Then visit: http://localhost:8080/

## GitHub Secrets Required
Set these in your repo → Settings → Secrets and variables → Actions:

| Secret Name | Description |
|-------------|-------------|
| `DEV_APP_ENV` | Value: `development` |
| `PROD_APP_ENV` | Value: `production` |
| `APP_VERSION` | Value: `1.0.0` |
| `DEV_DEPLOY_HOST` | Value: `dev.yourserver.com` |
| `PROD_DEPLOY_HOST` | Value: `prod.yourserver.com` |

## GitHub Environments Required
Set these in your repo → Settings → Environments:
- `development`
- `production` (optionally add required reviewers for approval)
