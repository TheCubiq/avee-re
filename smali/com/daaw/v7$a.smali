.class public final Lcom/daaw/v7$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/lt0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/v7;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/lt0<",
        "Lcom/daaw/wf;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lcom/daaw/v7$a;

.field public static final b:Lcom/daaw/q00;

.field public static final c:Lcom/daaw/q00;

.field public static final d:Lcom/daaw/q00;

.field public static final e:Lcom/daaw/q00;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/daaw/v7$a;

    invoke-direct {v0}, Lcom/daaw/v7$a;-><init>()V

    sput-object v0, Lcom/daaw/v7$a;->a:Lcom/daaw/v7$a;

    const-string v0, "window"

    invoke-static {v0}, Lcom/daaw/q00;->a(Ljava/lang/String;)Lcom/daaw/q00$b;

    move-result-object v0

    invoke-static {}, Lcom/daaw/w6;->b()Lcom/daaw/w6;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lcom/daaw/w6;->c(I)Lcom/daaw/w6;

    move-result-object v1

    invoke-virtual {v1}, Lcom/daaw/w6;->a()Lcom/daaw/uz0;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/q00$b;->b(Ljava/lang/annotation/Annotation;)Lcom/daaw/q00$b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/q00$b;->a()Lcom/daaw/q00;

    move-result-object v0

    sput-object v0, Lcom/daaw/v7$a;->b:Lcom/daaw/q00;

    const-string v0, "logSourceMetrics"

    invoke-static {v0}, Lcom/daaw/q00;->a(Ljava/lang/String;)Lcom/daaw/q00$b;

    move-result-object v0

    invoke-static {}, Lcom/daaw/w6;->b()Lcom/daaw/w6;

    move-result-object v1

    const/4 v2, 0x2

    invoke-virtual {v1, v2}, Lcom/daaw/w6;->c(I)Lcom/daaw/w6;

    move-result-object v1

    invoke-virtual {v1}, Lcom/daaw/w6;->a()Lcom/daaw/uz0;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/q00$b;->b(Ljava/lang/annotation/Annotation;)Lcom/daaw/q00$b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/q00$b;->a()Lcom/daaw/q00;

    move-result-object v0

    sput-object v0, Lcom/daaw/v7$a;->c:Lcom/daaw/q00;

    const-string v0, "globalMetrics"

    invoke-static {v0}, Lcom/daaw/q00;->a(Ljava/lang/String;)Lcom/daaw/q00$b;

    move-result-object v0

    invoke-static {}, Lcom/daaw/w6;->b()Lcom/daaw/w6;

    move-result-object v1

    const/4 v2, 0x3

    invoke-virtual {v1, v2}, Lcom/daaw/w6;->c(I)Lcom/daaw/w6;

    move-result-object v1

    invoke-virtual {v1}, Lcom/daaw/w6;->a()Lcom/daaw/uz0;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/q00$b;->b(Ljava/lang/annotation/Annotation;)Lcom/daaw/q00$b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/q00$b;->a()Lcom/daaw/q00;

    move-result-object v0

    sput-object v0, Lcom/daaw/v7$a;->d:Lcom/daaw/q00;

    const-string v0, "appNamespace"

    invoke-static {v0}, Lcom/daaw/q00;->a(Ljava/lang/String;)Lcom/daaw/q00$b;

    move-result-object v0

    invoke-static {}, Lcom/daaw/w6;->b()Lcom/daaw/w6;

    move-result-object v1

    const/4 v2, 0x4

    invoke-virtual {v1, v2}, Lcom/daaw/w6;->c(I)Lcom/daaw/w6;

    move-result-object v1

    invoke-virtual {v1}, Lcom/daaw/w6;->a()Lcom/daaw/uz0;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/q00$b;->b(Ljava/lang/annotation/Annotation;)Lcom/daaw/q00$b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/q00$b;->a()Lcom/daaw/q00;

    move-result-object v0

    sput-object v0, Lcom/daaw/v7$a;->e:Lcom/daaw/q00;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/daaw/wf;

    check-cast p2, Lcom/daaw/mt0;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/v7$a;->b(Lcom/daaw/wf;Lcom/daaw/mt0;)V

    return-void
.end method

.method public b(Lcom/daaw/wf;Lcom/daaw/mt0;)V
    .locals 2

    sget-object v0, Lcom/daaw/v7$a;->b:Lcom/daaw/q00;

    invoke-virtual {p1}, Lcom/daaw/wf;->d()Lcom/daaw/ml1;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lcom/daaw/mt0;->e(Lcom/daaw/q00;Ljava/lang/Object;)Lcom/daaw/mt0;

    sget-object v0, Lcom/daaw/v7$a;->c:Lcom/daaw/q00;

    invoke-virtual {p1}, Lcom/daaw/wf;->c()Ljava/util/List;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lcom/daaw/mt0;->e(Lcom/daaw/q00;Ljava/lang/Object;)Lcom/daaw/mt0;

    sget-object v0, Lcom/daaw/v7$a;->d:Lcom/daaw/q00;

    invoke-virtual {p1}, Lcom/daaw/wf;->b()Lcom/daaw/q70;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lcom/daaw/mt0;->e(Lcom/daaw/q00;Ljava/lang/Object;)Lcom/daaw/mt0;

    sget-object v0, Lcom/daaw/v7$a;->e:Lcom/daaw/q00;

    invoke-virtual {p1}, Lcom/daaw/wf;->a()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, v0, p1}, Lcom/daaw/mt0;->e(Lcom/daaw/q00;Ljava/lang/Object;)Lcom/daaw/mt0;

    return-void
.end method
