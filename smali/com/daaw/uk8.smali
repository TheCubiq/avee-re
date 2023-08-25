.class public final Lcom/daaw/uk8;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public a:Lcom/daaw/bi8;

.field public final b:Lcom/daaw/sk8;

.field public c:Lcom/daaw/yk8;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lcom/daaw/bi8;->c:Lcom/daaw/bi8;

    iput-object v0, p0, Lcom/daaw/uk8;->a:Lcom/daaw/bi8;

    sget-object v0, Lcom/daaw/sk8;->a:Lcom/daaw/sk8;

    iput-object v0, p0, Lcom/daaw/uk8;->b:Lcom/daaw/sk8;

    return-void
.end method

.method public static bridge synthetic a(Lcom/daaw/uk8;)Lcom/daaw/bi8;
    .locals 0

    iget-object p0, p0, Lcom/daaw/uk8;->a:Lcom/daaw/bi8;

    return-object p0
.end method

.method public static bridge synthetic e(Lcom/daaw/uk8;)Lcom/daaw/yk8;
    .locals 0

    iget-object p0, p0, Lcom/daaw/uk8;->c:Lcom/daaw/yk8;

    return-object p0
.end method


# virtual methods
.method public final b(Lcom/daaw/bi8;)Lcom/daaw/uk8;
    .locals 0

    iput-object p1, p0, Lcom/daaw/uk8;->a:Lcom/daaw/bi8;

    return-object p0
.end method

.method public final c([Lcom/daaw/hi8;)Lcom/daaw/uk8;
    .locals 1

    new-instance v0, Lcom/daaw/yk8;

    invoke-direct {v0, p1}, Lcom/daaw/yk8;-><init>([Lcom/daaw/hi8;)V

    iput-object v0, p0, Lcom/daaw/uk8;->c:Lcom/daaw/yk8;

    return-object p0
.end method

.method public final d()Lcom/daaw/sl8;
    .locals 2

    iget-object v0, p0, Lcom/daaw/uk8;->c:Lcom/daaw/yk8;

    if-nez v0, :cond_0

    new-instance v0, Lcom/daaw/yk8;

    const/4 v1, 0x0

    new-array v1, v1, [Lcom/daaw/hi8;

    invoke-direct {v0, v1}, Lcom/daaw/yk8;-><init>([Lcom/daaw/hi8;)V

    iput-object v0, p0, Lcom/daaw/uk8;->c:Lcom/daaw/yk8;

    :cond_0
    new-instance v0, Lcom/daaw/sl8;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/daaw/sl8;-><init>(Lcom/daaw/uk8;Lcom/daaw/ql8;)V

    return-object v0
.end method
