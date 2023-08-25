.class public Lcom/daaw/yv0$d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/t40;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/yv0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/t40<",
        "Ljava/lang/Integer;",
        "[F[F",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/yv0;


# direct methods
.method public constructor <init>(Lcom/daaw/yv0;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/yv0$d;->a:Lcom/daaw/yv0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Integer;[F[F)Ljava/lang/Boolean;
    .locals 0

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p1
.end method

.method public bridge synthetic j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Integer;

    check-cast p2, [F

    check-cast p3, [F

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/yv0$d;->a(Ljava/lang/Integer;[F[F)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
