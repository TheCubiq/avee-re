.class public final Lcom/daaw/hn$a;
.super Lcom/daaw/hn;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/hn;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final b:Lcom/daaw/hn$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/hn$a;

    invoke-direct {v0}, Lcom/daaw/hn$a;-><init>()V

    sput-object v0, Lcom/daaw/hn$a;->b:Lcom/daaw/hn$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/daaw/hn;-><init>()V

    return-void
.end method
