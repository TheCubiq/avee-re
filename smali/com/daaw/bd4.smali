.class public Lcom/daaw/bd4;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:I

.field public final b:I

.field public final c:I

.field public final d:I

.field public e:I

.field public f:I

.field public g:Z

.field public final h:Lcom/daaw/y17;

.field public final i:Lcom/daaw/y17;

.field public final j:I

.field public final k:I

.field public final l:Lcom/daaw/y17;

.field public m:Lcom/daaw/y17;

.field public n:I

.field public final o:Ljava/util/HashMap;

.field public final p:Ljava/util/HashSet;


# direct methods
.method public constructor <init>()V
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const v0, 0x7fffffff

    iput v0, p0, Lcom/daaw/bd4;->a:I

    iput v0, p0, Lcom/daaw/bd4;->b:I

    iput v0, p0, Lcom/daaw/bd4;->c:I

    iput v0, p0, Lcom/daaw/bd4;->d:I

    iput v0, p0, Lcom/daaw/bd4;->e:I

    iput v0, p0, Lcom/daaw/bd4;->f:I

    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/daaw/bd4;->g:Z

    invoke-static {}, Lcom/daaw/y17;->u()Lcom/daaw/y17;

    move-result-object v1

    iput-object v1, p0, Lcom/daaw/bd4;->h:Lcom/daaw/y17;

    invoke-static {}, Lcom/daaw/y17;->u()Lcom/daaw/y17;

    move-result-object v1

    iput-object v1, p0, Lcom/daaw/bd4;->i:Lcom/daaw/y17;

    iput v0, p0, Lcom/daaw/bd4;->j:I

    iput v0, p0, Lcom/daaw/bd4;->k:I

    invoke-static {}, Lcom/daaw/y17;->u()Lcom/daaw/y17;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/bd4;->l:Lcom/daaw/y17;

    invoke-static {}, Lcom/daaw/y17;->u()Lcom/daaw/y17;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/bd4;->m:Lcom/daaw/y17;

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/bd4;->n:I

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/daaw/bd4;->o:Ljava/util/HashMap;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/daaw/bd4;->p:Ljava/util/HashSet;

    return-void
.end method

.method public constructor <init>(Lcom/daaw/de4;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const v0, 0x7fffffff

    iput v0, p0, Lcom/daaw/bd4;->a:I

    iput v0, p0, Lcom/daaw/bd4;->b:I

    iput v0, p0, Lcom/daaw/bd4;->c:I

    iput v0, p0, Lcom/daaw/bd4;->d:I

    iget v1, p1, Lcom/daaw/de4;->i:I

    iput v1, p0, Lcom/daaw/bd4;->e:I

    iget v1, p1, Lcom/daaw/de4;->j:I

    iput v1, p0, Lcom/daaw/bd4;->f:I

    iget-boolean v1, p1, Lcom/daaw/de4;->k:Z

    iput-boolean v1, p0, Lcom/daaw/bd4;->g:Z

    iget-object v1, p1, Lcom/daaw/de4;->l:Lcom/daaw/y17;

    iput-object v1, p0, Lcom/daaw/bd4;->h:Lcom/daaw/y17;

    iget-object v1, p1, Lcom/daaw/de4;->n:Lcom/daaw/y17;

    iput-object v1, p0, Lcom/daaw/bd4;->i:Lcom/daaw/y17;

    iput v0, p0, Lcom/daaw/bd4;->j:I

    iput v0, p0, Lcom/daaw/bd4;->k:I

    iget-object v0, p1, Lcom/daaw/de4;->r:Lcom/daaw/y17;

    iput-object v0, p0, Lcom/daaw/bd4;->l:Lcom/daaw/y17;

    iget-object v0, p1, Lcom/daaw/de4;->s:Lcom/daaw/y17;

    iput-object v0, p0, Lcom/daaw/bd4;->m:Lcom/daaw/y17;

    iget v0, p1, Lcom/daaw/de4;->t:I

    iput v0, p0, Lcom/daaw/bd4;->n:I

    new-instance v0, Ljava/util/HashSet;

    iget-object v1, p1, Lcom/daaw/de4;->z:Lcom/daaw/d27;

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lcom/daaw/bd4;->p:Ljava/util/HashSet;

    new-instance v0, Ljava/util/HashMap;

    iget-object p1, p1, Lcom/daaw/de4;->y:Lcom/daaw/b27;

    invoke-direct {v0, p1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    iput-object v0, p0, Lcom/daaw/bd4;->o:Ljava/util/HashMap;

    return-void
.end method

.method public static bridge synthetic a(Lcom/daaw/bd4;)I
    .locals 0

    iget p0, p0, Lcom/daaw/bd4;->n:I

    return p0
.end method

.method public static bridge synthetic b(Lcom/daaw/bd4;)I
    .locals 0

    iget p0, p0, Lcom/daaw/bd4;->f:I

    return p0
.end method

.method public static bridge synthetic c(Lcom/daaw/bd4;)I
    .locals 0

    iget p0, p0, Lcom/daaw/bd4;->e:I

    return p0
.end method

.method public static bridge synthetic f(Lcom/daaw/bd4;)Lcom/daaw/y17;
    .locals 0

    iget-object p0, p0, Lcom/daaw/bd4;->i:Lcom/daaw/y17;

    return-object p0
.end method

.method public static bridge synthetic g(Lcom/daaw/bd4;)Lcom/daaw/y17;
    .locals 0

    iget-object p0, p0, Lcom/daaw/bd4;->l:Lcom/daaw/y17;

    return-object p0
.end method

.method public static bridge synthetic h(Lcom/daaw/bd4;)Lcom/daaw/y17;
    .locals 0

    iget-object p0, p0, Lcom/daaw/bd4;->m:Lcom/daaw/y17;

    return-object p0
.end method

.method public static bridge synthetic i(Lcom/daaw/bd4;)Lcom/daaw/y17;
    .locals 0

    iget-object p0, p0, Lcom/daaw/bd4;->h:Lcom/daaw/y17;

    return-object p0
.end method

.method public static bridge synthetic j(Lcom/daaw/bd4;)Ljava/util/HashMap;
    .locals 0

    iget-object p0, p0, Lcom/daaw/bd4;->o:Ljava/util/HashMap;

    return-object p0
.end method

.method public static bridge synthetic k(Lcom/daaw/bd4;)Ljava/util/HashSet;
    .locals 0

    iget-object p0, p0, Lcom/daaw/bd4;->p:Ljava/util/HashSet;

    return-object p0
.end method

.method public static bridge synthetic l(Lcom/daaw/bd4;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/daaw/bd4;->g:Z

    return p0
.end method


# virtual methods
.method public final d(Landroid/content/Context;)Lcom/daaw/bd4;
    .locals 2

    sget v0, Lcom/daaw/it5;->a:I

    const/16 v1, 0x17

    if-ge v0, v1, :cond_0

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    if-eqz v0, :cond_2

    :cond_0
    const-string v0, "captioning"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/accessibility/CaptioningManager;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Landroid/view/accessibility/CaptioningManager;->isEnabled()Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    const/16 v0, 0x440

    iput v0, p0, Lcom/daaw/bd4;->n:I

    invoke-virtual {p1}, Landroid/view/accessibility/CaptioningManager;->getLocale()Ljava/util/Locale;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-static {p1}, Lcom/daaw/it5;->n(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/daaw/y17;->v(Ljava/lang/Object;)Lcom/daaw/y17;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/bd4;->m:Lcom/daaw/y17;

    :cond_2
    :goto_0
    return-object p0
.end method

.method public e(IIZ)Lcom/daaw/bd4;
    .locals 0

    iput p1, p0, Lcom/daaw/bd4;->e:I

    iput p2, p0, Lcom/daaw/bd4;->f:I

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/daaw/bd4;->g:Z

    return-object p0
.end method
