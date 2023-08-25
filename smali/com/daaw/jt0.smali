.class public Lcom/daaw/jt0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/e51;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/daaw/e51<",
        "TT;>;"
    }
.end annotation


# static fields
.field public static final a:Lcom/daaw/jt0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/jt0<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/jt0;

    invoke-direct {v0}, Lcom/daaw/jt0;-><init>()V

    sput-object v0, Lcom/daaw/jt0;->a:Lcom/daaw/jt0;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static c()Lcom/daaw/jt0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">()",
            "Lcom/daaw/jt0<",
            "TT;>;"
        }
    .end annotation

    sget-object v0, Lcom/daaw/jt0;->a:Lcom/daaw/jt0;

    return-object v0
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/io/OutputStream;)Z
    .locals 0

    check-cast p1, Lcom/daaw/z41;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/jt0;->b(Lcom/daaw/z41;Ljava/io/OutputStream;)Z

    move-result p1

    return p1
.end method

.method public b(Lcom/daaw/z41;Ljava/io/OutputStream;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/z41<",
            "TT;>;",
            "Ljava/io/OutputStream;",
            ")Z"
        }
    .end annotation

    const/4 p1, 0x0

    return p1
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    const-string v0, ""

    return-object v0
.end method
