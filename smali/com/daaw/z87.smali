.class public final Lcom/daaw/z87;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public a:Z

.field public final b:Lcom/daaw/v87;

.field public final c:Lcom/daaw/m87;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field public final d:Lcom/daaw/l97;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field public e:Lcom/daaw/a97;

.field public f:Lcom/daaw/b97;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/l97;Lcom/daaw/y87;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object p2, Lcom/daaw/v87;->b:Lcom/daaw/v87;

    iput-object p2, p0, Lcom/daaw/z87;->b:Lcom/daaw/v87;

    const/4 p2, 0x0

    iput-object p2, p0, Lcom/daaw/z87;->e:Lcom/daaw/a97;

    iput-object p2, p0, Lcom/daaw/z87;->f:Lcom/daaw/b97;

    iput-object p2, p0, Lcom/daaw/z87;->c:Lcom/daaw/m87;

    iput-object p1, p0, Lcom/daaw/z87;->d:Lcom/daaw/l97;

    return-void
.end method

.method public static bridge synthetic a(Lcom/daaw/z87;)Lcom/daaw/m87;
    .locals 0

    iget-object p0, p0, Lcom/daaw/z87;->c:Lcom/daaw/m87;

    const/4 p0, 0x0

    return-object p0
.end method

.method public static bridge synthetic b(Lcom/daaw/z87;)Lcom/daaw/v87;
    .locals 0

    iget-object p0, p0, Lcom/daaw/z87;->b:Lcom/daaw/v87;

    return-object p0
.end method

.method public static bridge synthetic f(Lcom/daaw/z87;)Lcom/daaw/a97;
    .locals 0

    iget-object p0, p0, Lcom/daaw/z87;->e:Lcom/daaw/a97;

    return-object p0
.end method

.method public static bridge synthetic g(Lcom/daaw/z87;)Lcom/daaw/b97;
    .locals 0

    iget-object p0, p0, Lcom/daaw/z87;->f:Lcom/daaw/b97;

    return-object p0
.end method

.method public static bridge synthetic h(Lcom/daaw/z87;)Lcom/daaw/l97;
    .locals 0

    iget-object p0, p0, Lcom/daaw/z87;->d:Lcom/daaw/l97;

    return-object p0
.end method

.method public static bridge synthetic i(Lcom/daaw/z87;Lcom/daaw/b97;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/z87;->f:Lcom/daaw/b97;

    return-void
.end method

.method public static bridge synthetic j(Lcom/daaw/z87;Z)V
    .locals 0

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/daaw/z87;->a:Z

    return-void
.end method

.method public static bridge synthetic k(Lcom/daaw/z87;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/daaw/z87;->a:Z

    return p0
.end method


# virtual methods
.method public final c()Lcom/daaw/v87;
    .locals 1

    iget-object v0, p0, Lcom/daaw/z87;->b:Lcom/daaw/v87;

    return-object v0
.end method

.method public final d()Lcom/daaw/z87;
    .locals 1

    iget-object v0, p0, Lcom/daaw/z87;->f:Lcom/daaw/b97;

    if-eqz v0, :cond_0

    invoke-static {v0}, Lcom/daaw/b97;->c(Lcom/daaw/b97;)V

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/z87;->a:Z

    return-object p0
.end method

.method public final e()Lcom/daaw/z87;
    .locals 1

    invoke-static {}, Lcom/daaw/a97;->b()Lcom/daaw/a97;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/z87;->e:Lcom/daaw/a97;

    return-object p0
.end method
