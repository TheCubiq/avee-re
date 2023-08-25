.class public final Lcom/daaw/ql$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/nl$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/ql;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/nl$c<",
        "Lcom/daaw/ql;",
        ">;"
    }
.end annotation


# static fields
.field public static final synthetic p:Lcom/daaw/ql$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/ql$a;

    invoke-direct {v0}, Lcom/daaw/ql$a;-><init>()V

    sput-object v0, Lcom/daaw/ql$a;->p:Lcom/daaw/ql$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
