.class public Lcom/daaw/avee/SplashActivity;
.super Lcom/daaw/p3;
.source ""


# instance fields
.field public M:Landroid/view/SurfaceView;

.field public N:Landroid/view/SurfaceHolder;

.field public O:Landroid/media/MediaPlayer;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/daaw/p3;-><init>()V

    return-void
.end method

.method public static synthetic T(Lcom/daaw/avee/SplashActivity;)V
    .locals 0

    invoke-virtual {p0}, Lcom/daaw/avee/SplashActivity;->V()V

    return-void
.end method

.method public static synthetic U(Lcom/daaw/avee/SplashActivity;)Landroid/media/MediaPlayer;
    .locals 0

    iget-object p0, p0, Lcom/daaw/avee/SplashActivity;->O:Landroid/media/MediaPlayer;

    return-object p0
.end method


# virtual methods
.method public final V()V
    .locals 2

    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/daaw/avee/MainActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 3

    invoke-super {p0, p1}, Lcom/daaw/p30;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f0c001c

    invoke-virtual {p0, p1}, Lcom/daaw/p3;->setContentView(I)V

    const p1, 0x7f090281

    invoke-virtual {p0, p1}, Lcom/daaw/p3;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/view/SurfaceView;

    iput-object p1, p0, Lcom/daaw/avee/SplashActivity;->M:Landroid/view/SurfaceView;

    new-instance p1, Landroid/media/MediaPlayer;

    invoke-direct {p1}, Landroid/media/MediaPlayer;-><init>()V

    iput-object p1, p0, Lcom/daaw/avee/SplashActivity;->O:Landroid/media/MediaPlayer;

    :try_start_0
    iget-object p1, p0, Lcom/daaw/avee/SplashActivity;->M:Landroid/view/SurfaceView;

    invoke-virtual {p1}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/avee/SplashActivity;->N:Landroid/view/SurfaceHolder;

    const/4 v0, -0x3

    invoke-interface {p1, v0}, Landroid/view/SurfaceHolder;->setFormat(I)V

    iget-object p1, p0, Lcom/daaw/avee/SplashActivity;->N:Landroid/view/SurfaceHolder;

    new-instance v0, Lcom/daaw/avee/SplashActivity$a;

    invoke-direct {v0, p0}, Lcom/daaw/avee/SplashActivity$a;-><init>(Lcom/daaw/avee/SplashActivity;)V

    invoke-interface {p1, v0}, Landroid/view/SurfaceHolder;->addCallback(Landroid/view/SurfaceHolder$Callback;)V

    iget-object p1, p0, Lcom/daaw/avee/SplashActivity;->O:Landroid/media/MediaPlayer;

    new-instance v0, Landroid/net/Uri$Builder;

    invoke-direct {v0}, Landroid/net/Uri$Builder;-><init>()V

    const-string v1, "android.resource"

    invoke-virtual {v0, v1}, Landroid/net/Uri$Builder;->scheme(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    invoke-virtual {p0}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/net/Uri$Builder;->authority(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    const-string v1, "2131689510"

    invoke-virtual {v0, v1}, Landroid/net/Uri$Builder;->appendPath(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {p1, p0, v0}, Landroid/media/MediaPlayer;->setDataSource(Landroid/content/Context;Landroid/net/Uri;)V

    iget-object p1, p0, Lcom/daaw/avee/SplashActivity;->O:Landroid/media/MediaPlayer;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/media/MediaPlayer;->setLooping(Z)V

    iget-object p1, p0, Lcom/daaw/avee/SplashActivity;->O:Landroid/media/MediaPlayer;

    invoke-virtual {p1}, Landroid/media/MediaPlayer;->prepare()V

    iget-object p1, p0, Lcom/daaw/avee/SplashActivity;->O:Landroid/media/MediaPlayer;

    invoke-virtual {p1}, Landroid/media/MediaPlayer;->start()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string v0, "splash webm fail"

    invoke-static {p1, v0}, Lcom/daaw/lz1;->b(Ljava/lang/Exception;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/daaw/avee/SplashActivity;->M:Landroid/view/SurfaceView;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/view/SurfaceView;->setVisibility(I)V

    const p1, 0x7f090167

    invoke-virtual {p0, p1}, Lcom/daaw/p3;->findViewById(I)Landroid/view/View;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    :goto_0
    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    new-instance v0, Lcom/daaw/qe1;

    invoke-direct {v0, p0}, Lcom/daaw/qe1;-><init>(Lcom/daaw/avee/SplashActivity;)V

    const-wide/16 v1, 0x535

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public onDestroy()V
    .locals 2

    invoke-super {p0}, Lcom/daaw/p3;->onDestroy()V

    iget-object v0, p0, Lcom/daaw/avee/SplashActivity;->O:Landroid/media/MediaPlayer;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->stop()V

    iget-object v0, p0, Lcom/daaw/avee/SplashActivity;->O:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->release()V

    iput-object v1, p0, Lcom/daaw/avee/SplashActivity;->O:Landroid/media/MediaPlayer;

    :cond_0
    iput-object v1, p0, Lcom/daaw/avee/SplashActivity;->M:Landroid/view/SurfaceView;

    iput-object v1, p0, Lcom/daaw/avee/SplashActivity;->N:Landroid/view/SurfaceHolder;

    return-void
.end method
