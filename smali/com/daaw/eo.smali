.class public final Lcom/daaw/eo;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:Lcom/daaw/yc0;

.field public final c:Lcom/daaw/xc0;

.field public final d:Landroid/content/ComponentName;

.field public final e:Landroid/app/PendingIntent;


# direct methods
.method public constructor <init>(Lcom/daaw/yc0;Lcom/daaw/xc0;Landroid/content/ComponentName;Landroid/app/PendingIntent;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/daaw/eo;->a:Ljava/lang/Object;

    iput-object p1, p0, Lcom/daaw/eo;->b:Lcom/daaw/yc0;

    iput-object p2, p0, Lcom/daaw/eo;->c:Lcom/daaw/xc0;

    iput-object p3, p0, Lcom/daaw/eo;->d:Landroid/content/ComponentName;

    iput-object p4, p0, Lcom/daaw/eo;->e:Landroid/app/PendingIntent;

    return-void
.end method


# virtual methods
.method public a()Landroid/os/IBinder;
    .locals 1

    iget-object v0, p0, Lcom/daaw/eo;->c:Lcom/daaw/xc0;

    invoke-interface {v0}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    return-object v0
.end method

.method public b()Landroid/content/ComponentName;
    .locals 1

    iget-object v0, p0, Lcom/daaw/eo;->d:Landroid/content/ComponentName;

    return-object v0
.end method

.method public c()Landroid/app/PendingIntent;
    .locals 1

    iget-object v0, p0, Lcom/daaw/eo;->e:Landroid/app/PendingIntent;

    return-object v0
.end method
