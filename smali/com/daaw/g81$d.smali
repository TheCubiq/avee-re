.class public final Lcom/daaw/g81$d;
.super Lcom/daaw/si0;
.source ""

# interfaces
.implements Lcom/daaw/z40;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/g81;->b(Lcom/daaw/nt1;)Lcom/daaw/i81;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/daaw/si0;",
        "Lcom/daaw/z40<",
        "Lcom/daaw/hn;",
        "Lcom/daaw/i81;",
        ">;"
    }
.end annotation


# static fields
.field public static final q:Lcom/daaw/g81$d;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/g81$d;

    invoke-direct {v0}, Lcom/daaw/g81$d;-><init>()V

    sput-object v0, Lcom/daaw/g81$d;->q:Lcom/daaw/g81$d;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/daaw/si0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic b(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/daaw/hn;

    invoke-virtual {p0, p1}, Lcom/daaw/g81$d;->d(Lcom/daaw/hn;)Lcom/daaw/i81;

    move-result-object p1

    return-object p1
.end method

.method public final d(Lcom/daaw/hn;)Lcom/daaw/i81;
    .locals 1

    const-string v0, "$this$initializer"

    invoke-static {p1, v0}, Lcom/daaw/ug0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lcom/daaw/i81;

    invoke-direct {p1}, Lcom/daaw/i81;-><init>()V

    return-object p1
.end method
