.class public final Lcom/daaw/zh0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ax;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/zh0$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/ax<",
        "Lcom/daaw/zh0;",
        ">;"
    }
.end annotation


# static fields
.field public static final e:Lcom/daaw/lt0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/lt0<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public static final f:Lcom/daaw/xr1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/xr1<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final g:Lcom/daaw/xr1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/xr1<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public static final h:Lcom/daaw/zh0$b;


# instance fields
.field public final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Lcom/daaw/lt0<",
            "*>;>;"
        }
    .end annotation
.end field

.field public final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Lcom/daaw/xr1<",
            "*>;>;"
        }
    .end annotation
.end field

.field public c:Lcom/daaw/lt0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/lt0<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public d:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    sget-object v0, Lcom/daaw/wh0;->a:Lcom/daaw/wh0;

    sput-object v0, Lcom/daaw/zh0;->e:Lcom/daaw/lt0;

    sget-object v0, Lcom/daaw/yh0;->a:Lcom/daaw/yh0;

    sput-object v0, Lcom/daaw/zh0;->f:Lcom/daaw/xr1;

    sget-object v0, Lcom/daaw/xh0;->a:Lcom/daaw/xh0;

    sput-object v0, Lcom/daaw/zh0;->g:Lcom/daaw/xr1;

    new-instance v0, Lcom/daaw/zh0$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/daaw/zh0$b;-><init>(Lcom/daaw/zh0$a;)V

    sput-object v0, Lcom/daaw/zh0;->h:Lcom/daaw/zh0$b;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/daaw/zh0;->a:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/daaw/zh0;->b:Ljava/util/Map;

    sget-object v0, Lcom/daaw/zh0;->e:Lcom/daaw/lt0;

    iput-object v0, p0, Lcom/daaw/zh0;->c:Lcom/daaw/lt0;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/zh0;->d:Z

    const-class v0, Ljava/lang/String;

    sget-object v1, Lcom/daaw/zh0;->f:Lcom/daaw/xr1;

    invoke-virtual {p0, v0, v1}, Lcom/daaw/zh0;->p(Ljava/lang/Class;Lcom/daaw/xr1;)Lcom/daaw/zh0;

    const-class v0, Ljava/lang/Boolean;

    sget-object v1, Lcom/daaw/zh0;->g:Lcom/daaw/xr1;

    invoke-virtual {p0, v0, v1}, Lcom/daaw/zh0;->p(Ljava/lang/Class;Lcom/daaw/xr1;)Lcom/daaw/zh0;

    const-class v0, Ljava/util/Date;

    sget-object v1, Lcom/daaw/zh0;->h:Lcom/daaw/zh0$b;

    invoke-virtual {p0, v0, v1}, Lcom/daaw/zh0;->p(Ljava/lang/Class;Lcom/daaw/xr1;)Lcom/daaw/zh0;

    return-void
.end method

.method public static synthetic b(Ljava/lang/Object;Lcom/daaw/mt0;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/daaw/zh0;->l(Ljava/lang/Object;Lcom/daaw/mt0;)V

    return-void
.end method

.method public static synthetic c(Ljava/lang/String;Lcom/daaw/yr1;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/daaw/zh0;->m(Ljava/lang/String;Lcom/daaw/yr1;)V

    return-void
.end method

.method public static synthetic d(Ljava/lang/Boolean;Lcom/daaw/yr1;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/daaw/zh0;->n(Ljava/lang/Boolean;Lcom/daaw/yr1;)V

    return-void
.end method

.method public static synthetic e(Lcom/daaw/zh0;)Ljava/util/Map;
    .locals 0

    iget-object p0, p0, Lcom/daaw/zh0;->a:Ljava/util/Map;

    return-object p0
.end method

.method public static synthetic f(Lcom/daaw/zh0;)Ljava/util/Map;
    .locals 0

    iget-object p0, p0, Lcom/daaw/zh0;->b:Ljava/util/Map;

    return-object p0
.end method

.method public static synthetic g(Lcom/daaw/zh0;)Lcom/daaw/lt0;
    .locals 0

    iget-object p0, p0, Lcom/daaw/zh0;->c:Lcom/daaw/lt0;

    return-object p0
.end method

.method public static synthetic h(Lcom/daaw/zh0;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/daaw/zh0;->d:Z

    return p0
.end method

.method public static synthetic l(Ljava/lang/Object;Lcom/daaw/mt0;)V
    .locals 2

    new-instance p1, Lcom/daaw/cx;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Couldn\'t find encoder for type "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Lcom/daaw/cx;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static synthetic m(Ljava/lang/String;Lcom/daaw/yr1;)V
    .locals 0

    invoke-interface {p1, p0}, Lcom/daaw/yr1;->c(Ljava/lang/String;)Lcom/daaw/yr1;

    return-void
.end method

.method public static synthetic n(Ljava/lang/Boolean;Lcom/daaw/yr1;)V
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    invoke-interface {p1, p0}, Lcom/daaw/yr1;->d(Z)Lcom/daaw/yr1;

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Class;Lcom/daaw/lt0;)Lcom/daaw/ax;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/daaw/zh0;->o(Ljava/lang/Class;Lcom/daaw/lt0;)Lcom/daaw/zh0;

    move-result-object p1

    return-object p1
.end method

.method public i()Lcom/daaw/hp;
    .locals 1

    new-instance v0, Lcom/daaw/zh0$a;

    invoke-direct {v0, p0}, Lcom/daaw/zh0$a;-><init>(Lcom/daaw/zh0;)V

    return-object v0
.end method

.method public j(Lcom/daaw/dj;)Lcom/daaw/zh0;
    .locals 0

    invoke-interface {p1, p0}, Lcom/daaw/dj;->a(Lcom/daaw/ax;)V

    return-object p0
.end method

.method public k(Z)Lcom/daaw/zh0;
    .locals 0

    iput-boolean p1, p0, Lcom/daaw/zh0;->d:Z

    return-object p0
.end method

.method public o(Ljava/lang/Class;Lcom/daaw/lt0;)Lcom/daaw/zh0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Lcom/daaw/lt0<",
            "-TT;>;)",
            "Lcom/daaw/zh0;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/zh0;->a:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p2, p0, Lcom/daaw/zh0;->b:Ljava/util/Map;

    invoke-interface {p2, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method

.method public p(Ljava/lang/Class;Lcom/daaw/xr1;)Lcom/daaw/zh0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Lcom/daaw/xr1<",
            "-TT;>;)",
            "Lcom/daaw/zh0;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/zh0;->b:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p2, p0, Lcom/daaw/zh0;->a:Ljava/util/Map;

    invoke-interface {p2, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method
